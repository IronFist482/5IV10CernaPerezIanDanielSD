const express = require("express");
const app = express();
const mysql = require("mysql2");
var bodyParser = require("body-parser");
const { request } = require("express");
const { type } = require("os");

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "N0M3L0",
  database: "node",
});

con.connect();

app.use(bodyParser.json());

app.use(
  bodyParser.urlencoded({
    extended: true,
  })
);

app.use(express.static("public"));

app.post("/agregarUsuario", (req, res) => {

  let nombre = req.body.nombre;

  con.query('insert into usuario(nom_usuario) values("' + nombre + '")',(err, respuesta, fields) => {
      if (err) return console.log("Error", err);

      return res.send("<h3>Nombre: </h3>" + nombre);
    }
  );
});

app.get("/getUsuarios", (req, res) => {
  con.query("Select *FROM usuario", (err, respuesta, field) => {
    if (err) return console.log("ERROR:", err);

    var userHTML = ``;
    var quitar = "X";
    var i = 0;
    console.log(respuesta);
    respuesta.forEach((user) => {
      userHTML += `<tr><td>${user.id_usuario}</td><td>${user.nom_usuario}</td><td><a href='/eliminarUsuarios?id_eliminar=${user.id_usuario}'>${quitar}</a></td></tr>`;
    });

    return res.send(
      `<table><tr><th>id</th><th>Nombre:</th><th>Eliminar</th></tr>${userHTML}</table><br>
      <form action="/eliminarUsuario" method="post">
      <input type="number" name="id" placeholder="id">
      <input type="submit" value="Eliminar Usuario">
       </form>`
    );
  });
});

app.post("/eliminarUsuario", (req, res) => {

    let id = req.body.id;
    
    con.query("DELETE FROM usuario WHERE id_usuario="+id+";")
    return res.send(
      "Usuario eliminado"
    );
});

app.listen(3000, () => {
  console.log("Servidor escuchando el puerto 3000 en http://localhost:3000");
});
/*
npm install express --save
*/
