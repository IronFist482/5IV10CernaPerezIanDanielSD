function ayudaPorfavorunu(){

    //Valor de Espacio
    var primerEspacio = document.getElementById('primerEspacio').value;
    var primerEspacio = document.getElementById('segundoEspacio').value;
    var tercerEspacio = document.getElementById('tercerEspacio').value;
    var cuartoEspacio = document.getElementById('cuartoEspacio').value;

    //Cantidad de Números
    var longp = primerEspacio.length;
    var longs = segundoEspacio.length;
    var longt = tercerEspacio.length;
    var longc = cuartoEspacio.length;

    //Se verifica si el número es negativo
    if(primerEspacio <= -1 || segundoEspacio <= -1 || tercerEspacio <= -1 || cuartoEspacio <= -1){
        alert('Los números negativos no son validos');
        document.getElementById('claseIP').value = '';
    }

    //Se verifica si metieron datos a las casillas
    else if(primerEspacio == null || segundoEspacio == null || tercerEspacio == null || cuartoEspacio == null){
        alert('Hay casillas vacías, por favor llenalas');
        document.getElementById('claseIP').value = '';
    }

    //Se revisa si los números exceden el límite permitido
    else if(primerEspacio > 255 || segundoEspacio > 255 || tercerEspacio > 255 || cuartoEspacio > 255){
        alert('No existe una IP para esos valores');
        document.getElementById('claseIP').value ='';
    }

    //Se verifica que el tamaño del número no sea mayor a 3
    else if( longp > 3 || longs > 3 || longt > 3 || longc > 3){

        alert('Son mas de 3 numeros en alguna casilla');
        document.getElementById('claseIP').value = '';

    }

    //Se forma la IP
    else{
        var IP = primerEspacio + '.' + segundoEspacio + '.' + tercerEspacio + '.' + cuartoEspacio;
        var datos = (separar(IP).split(','));
        document.getElementById('claseIP').value = datos[0];
        document.getElementById('mascaraSubred').value = datos[1];
    }

}

//Función para separar la IP
function separar(IP){

    IPSeparada = IP.split('.')
    IPBinario = ''
    cerosFaltantes = '';

    for(var i = 0; i < IPSeparada.length; i++){
        numeroBinario = conBin(IPSeparada[i]);

        if(numeroBinario.length < 8){
            cerosFaltantes = '';
            numeroCeros = 8 - numeroBinario.length;

            for(var j = 0; j < numeroCeros; j++){
                cerosFaltantes += '0';
            }

            cerosFaltantes += numeroBinario;
            IPBinario += cerosFaltantes + '.';

        }

        else{

            IPBinario += numeroBinario + '.';

        }

    }

    IPBinariaC = IPBinario.slice(0 , -1);
    datos = clasificacion(IP);
    return datos;
}

//Conversion a Binario
function conBin(decimal){

    var binario = '';
    var resto;

    while(Math.floor(decimal) != 0){

        resto = decimal - Math.floor(decimal / 2) * 2;
        binario = resto + binario;
        decimal = Math.floor(decimal / 2);

    }

    return binario;

}

//Obtención del numero de host's
function obtenerHost(){

    var subredesNecesarias = document.getElementById('subredesNecesarias').value;

    if(subredesNecesarias == null){
        alert('No hay subredes');
    }

    else if(subredesNecesarias < 0){
        alert('El valor ingresado no es valido');
    }

    else{
        var numeroEspacios = '';
        var espacioDeSalto = '';
        var exponenteHost = 0;
        var mascaraDecimal = document.getElementById('mascaraSubred').value;
        var mascaraLista = (mascaraDecimal.slice(0 , -4)).split('.');
        var exponente = parseInt(Math.log2(parseInt(subredesNecesarias)));
    
        if(2 ** exponente < parseInt(subredesNecesarias)){
            exponente += 1
        }

        for(var i = 0; i < mascaraLista.length; i++){
            var parteDeSubred = mascaraLista[i];
            if(parseInt(parteDeSubred) == 0){
                numeroEspacios += '11111111';
            }
        }
        
        for(var j = 0; j < exponente; j++){
            espacioDeSalto += '1';
        }

        var espaciosSobrantes = numeroEspacios.length - espacioDeSalto.length;

        for(var k = 0; k < espaciosSobrantes.length; k++){
            espacioDeSalto += '0';
            exponenteHost += 1;
        }

        console.log(espacioDeSalto)
        var mascaraDisponible = convertirDecimal(numeroEspacios);
        var salto = mascaraDisponible - convertirDecimal(espacioDeSalto) + 1;
        document.getElementById('salto').value = parseInt(salto);
        document.getElementById('hostdisponbile').value = toString(2 ** exponenteHost);
    }

}

//Clasificación de la máscara de red
function clasificacion(IP){

    tipoDeRed = '';
    mascaraDeSubred = '';
    IPSeparada = IP.split('.');
    primerByte = parseInt(IPSeparada[0])

    if(primerByte >= 0 && primerByte < 128){
        tipoDeRed = 'A';
        mascaraDeSubred = '255.0.0.0 / 8';
    }

    else if(primerByte >= 128 && primerByte < 192){
        tipoDeRed = 'B';
        mascaraDeSubred = '255.255.0.0 / 16';
    }

    else if(primerByte >= 192 && primerByte < 224){
        tipoDeRed = 'C';
        mascaraDeSubred = '255.255.255.0 / 24';
    }

    else if(primerByte >= 224 && primerByte < 240){
        tipoDeRed = 'C';
        mascaraDeSubred = '(-)';
    }

    else if(primerByte >= 240 && primerByte < 256){
        tipoDeRed = 'D'
        mascaraDeSubred = '(-)';
    }
    
    else{
        alert('Ese rango de subred no existe flaco');
    }

    return tipoDeRed + ',' + mascaraDeSubred;

}

function convertirDecimal(binario){

    if(binario.constructor != String){
        return null;
    }

    else{
        binario = binario.replace(/[^01]/gi, '');
        return Number.parseInt(binario , 2);
    }
}