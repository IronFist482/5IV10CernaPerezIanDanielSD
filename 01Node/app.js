//Declaramos una variable constante en donde inmportamos la libreria de express

const express = require('express')

//Declaramos variable para hacer referencia a express
var app=express();

//Le decimos al servidor que utilizamos public para archivos del cliente
app.use(express.static('public'))

app.get('/ruta-get',(req,res)=>{
    res.send('<h1>Hola mundo desde la ruta get</h1>')
})

app.post('/ruta-post',(req,res)=>{
    res.send('<h1>Hola mundo desde la ruta post</h1>')
})
app.listen(8080,()=>{
    console.log('Puerto escuchado en el 3000')
})