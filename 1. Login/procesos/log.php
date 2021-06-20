<?php

  session_start();

  require "../clases/Conexion.php";
  require "../clases/ProcesosUsuarios.php";

  $u = $_POST['user'];
  $p = $_POST['pass'];

  $usuariosDB = new ProcesosUsuarios();

  $dataLogin = $usuariosDB->ValidarUsuario($u,$p);
  if($dataLogin){
    $_SESSION['ui'] = $dataLogin->id;
    $_SESSION['n'] = $dataLogin->nombre;
    $_SESSION['a'] = $dataLogin->apellido;
    $_SESSION['un'] = $dataLogin->username;

    header("Location: ../index.php");
  }else{
    header("Location: ../login.php");
  }

?>