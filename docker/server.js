const express = require('express');
const mysql = require('mysql2');
const app = express();
const port = 8080;

// Conectando ao banco de dados MySQL
const db = mysql.createConnection({
  host: 'db',
  user: 'root',
  password: 'rootpassword',
  database: 'microservice_db'
});

db.connect(err => {
  if (err) {
    console.error('Erro ao conectar ao banco de dados: ', err);
  } else {
    console.log('Conectado ao banco de dados.');
  }
});

// Rota simples para testar
app.get('/', (req, res) => {
  res.send('Hello from Node.js microservice!');
});

// Endpoint para pegar todos os usuários
app.get('/users', (req, res) => {
  db.query('SELECT * FROM users', (err, results) => {
    if (err) {
      return res.status(500).send('Erro ao acessar o banco de dados');
    }
    res.json(results);
  });
});

app.listen(port, () => {
  console.log(`API listening at http://localhost:${port}`);
});
