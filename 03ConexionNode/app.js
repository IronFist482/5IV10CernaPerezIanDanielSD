const express=require('express')
const app=express()
const mysql=require('mysql2')
var bodyParser=require('body-parser')

var con=mysql.createConnection({

    host:'localhost',
    user:'root',
    password:'N0M3L0',
    database:'node',
})

con.connect()

app.use(bodyParser.json())

app.use(bodyParser.urlencoded({
    extended:true
}))

app.use(express.static('public'))

app.post('/agregarUsuario',(req,res)=>{

    let nombre=req.body.nombre

    con.query('insert into usuario values("'+nombre+'")',(err,respuesta,fields)=>{
        
        if(err) return console.log('Error',err)

        return res.send('<h3>Nombre:</h3>'+nombre)
        return res.send('<a src=></a>'+nombre)
    })
})



app.get('/getUsuarios',(req,res)=>{

    con.query('Select *FROM usuario',(err,respuesta,field)=>{
        if(err)return console.log('ERROR:',err)

        var userHTML=``
        var i=0
        console.log(respuesta)
        respuesta.forEach(user=>{
            i++
            userHTML+=`<tr><td>${i}</td><td>${user.nombre}</td></tr>`
        })

        return res.send(`<table><tr><th>id </th><th>Nombre:</th></tr>${userHTML}</table>`)
    })
    
})

app.listen(3000,()=>{
    console.log("Servidor escuchando el puerto 3000 en http://localhost:3000")
})
/*
npm install express --save
*/