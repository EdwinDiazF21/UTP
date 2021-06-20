<?php

DEFINE("DB_HOST","localhost");
DEFINE("DB_USER","root");
DEFINE("DB_PASS","psII");
DEFINE("DB_NAME","tallerphp");

class Conexion{
  function Conectar(){
    return mysqli_connect(DB_HOST,DB_USER,DB_PASS,DB_NAME);
  }
}
?>