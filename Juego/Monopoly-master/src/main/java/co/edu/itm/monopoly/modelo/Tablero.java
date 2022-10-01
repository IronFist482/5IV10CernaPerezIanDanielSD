package co.edu.itm.monopoly.modelo;

public class Tablero {

    int[] valor;
    int valor1;
    int valor2;
    Dado valorDado = new Dado();

    Object tablero[] = new Object[28];

    Casilla casilla1;
    Casilla casilla2;
    Casilla casilla3;
    Casilla casilla4;
    Casilla casilla5;
    Casilla casilla6;
    Casilla casilla7;
    Casilla casilla8;
    Casilla casilla9;
    Casilla casilla10;
    Casilla casilla11;
    Casilla casilla12;
    Casilla casilla13;
    Casilla casilla14;
    Casilla casilla15;
    Casilla casilla16;
    Casilla casilla17;
    Casilla casilla18;
    Casilla casilla19;
    Casilla casilla20;
    Casilla casilla21;
    Casilla casilla22;
    Casilla casilla23;
    Casilla casilla24;
    Casilla casilla25;
    Casilla casilla26;
    Casilla casilla27;
    Casilla casilla28;

    public Tablero() {

        casilla1 = new Salida(1, 40, 563);

        casilla2 = new Esferas(2, 40, 500);//casilla1

        casilla3 = new Propiedad("Ciudad Satán", 60, 2, 10, 30, 90, 160, 250,
                3, 40, 430, "rosa", 30, false, false, 50, 50);//casilla2

        casilla4 = new Villanos(4, 40, 355);//casilla3

        casilla5 = new Propiedad("Kame House", 60, 4, 20, 60, 180, 320, 450,
                5, 40, 280, "naranja", 30, false, false, 50, 50);//casilla4

        casilla6 = new Esferas(6, 40, 207);//casilla5

        casilla7 = new Propiedad("Templo del maestro Karin", 100, 6, 30, 90, 270, 400,
                500, 7, 40, 130, "azul claro", 50, false, false, 50, 50);//casilla6

        casilla8 = new Carcel(8, 40, 45);//casilla7

        casilla9 = new Villanos(9, 163, 50);//casilla8

        casilla10 = new Propiedad("Camino de la Serpiente", 100, 6, 30, 90, 270, 400,
                500, 10, 235, 50, "azul claro", 50, false, false, 50, 50);//casilla9

        casilla11 = new Esferas(11, 310, 50);//casilla10

        casilla12 = new Propiedad("Planeta Kaio", 140, 10, 50, 150, 450, 625,
                750, 12, 384, 50, "rosado", 70, false, false, 100, 100);//casilla11

        casilla13 = new Villanos(13, 456, 50);//casilla12

        casilla14 = new Propiedad("Infierno", 140, 10, 50, 150, 450, 625,
                750, 14, 530, 50, "rosado", 70, false, false, 100, 100);//casilla13

        casilla15 = new ParadaLibre(15, 615, 50);//casilla14

        casilla16 = new Propiedad("--------", 180, 14, 70, 200, 550, 750, 950, 16,
                684, 130, "naranja", 90, false, false, 100, 100);//casilla15

        casilla17 = new Villanos(17, 684, 207);//casilla16

        casilla18 = new Propiedad("--------", 180, 14, 70, 200, 550, 750, 950, 18,
                684, 280, "naranja", 90, false, false, 100, 100);//casilla17

        casilla19 = new Esferas(19, 684, 355);//casilla18

        casilla20 = new Propiedad("--------", 180, 14, 70, 200, 550, 750, 950, 20,
                684, 430, "naranja", 90, false, false, 100, 100);//casilla19

        casilla21 = new Villanos(21, 684, 500);//casilla20

        casilla22 = new Carcel(22, 40, 45);//casilla21

        casilla23 = new Propiedad("--------", 220, 18, 90, 250, 700, 875, 1050, 23,
                530, 563, "rojo", 110, false, false, 150, 150);//casilla22

        casilla24 = new Heroes(24, 456, 563);//casilla23

        casilla25 = new Propiedad("--------", 240, 20, 100, 300, 750, 925, 1100, 25,
                384, 563, "rojo", 120, false, false, 150, 150);//casilla24

        casilla26 = new Esferas(26, 310, 563);//casilla25

        casilla27 = new Propiedad("--------", 260, 22, 110, 330, 800, 975, 1150, 27,
                235, 563, "amarillo", 130, false, false, 150, 150);//casilla26

        casilla28 = new Villanos(28, 163, 563);//casilla27

        tablero[0] = casilla1;
        tablero[1] = casilla2;
        tablero[2] = casilla3;
        tablero[3] = casilla4;
        tablero[4] = casilla5;
        tablero[5] = casilla6;
        tablero[6] = casilla7;
        tablero[7] = casilla8;
        tablero[8] = casilla9;
        tablero[9] = casilla10;
        tablero[10] = casilla11;
        tablero[11] = casilla12;
        tablero[12] = casilla13;
        tablero[13] = casilla14;
        tablero[14] = casilla15;
        tablero[15] = casilla16;
        tablero[16] = casilla17;
        tablero[17] = casilla18;
        tablero[18] = casilla19;
        tablero[19] = casilla20;
        tablero[20] = casilla21;
        tablero[21] = casilla22;
        tablero[22] = casilla23;
        tablero[23] = casilla24;
        tablero[24] = casilla25;
        tablero[25] = casilla26;
        tablero[26] = casilla27;
        tablero[27] = casilla28;
    }

    public Casilla retornaPorPosicion(int pos) {
        valor = valorDado.lanzarDados();
        valor1 = valor[0];
        valor2 = valor[1];
        if (pos <= 27) {
            return (Casilla) tablero[pos];
        }   if(pos>27 && pos<=55) {
            pos=pos-28;
            System.out.println("Esta es la posición: "+pos);
            return (Casilla) tablero[pos];
        }   if(pos>55 && pos<=83) {
            pos=pos-56;
            System.out.println("Esta es la posición: "+pos);
            return (Casilla) tablero[pos];
        }   if(pos>83 && pos<=111) {
            pos=pos-84;
            System.out.println("Esta es la posición: "+pos);
            return (Casilla) tablero[pos];
        }   if(pos>111 && pos<=139) {
            pos=pos-112;
            System.out.println("Esta es la posición: "+pos);
            return (Casilla) tablero[pos];
        }   if(pos>167 && pos<=195) {
            pos=pos-168;
            System.out.println("Esta es la posición: "+pos);
            return (Casilla) tablero[pos];
        }   if(pos>195 && pos<=223) {
            pos=pos-196;
            System.out.println("Esta es la posición: "+pos);
            return (Casilla) tablero[pos];
        }   else{
            return null;
        }
    }

}
