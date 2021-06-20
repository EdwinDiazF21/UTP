<?php

  require "../clases/Conexion.php";
  require "../clases/ProcesosUsuarios.php";

  //Datos del cliente
  $nombre = $_POST['nombre'];
  $apellido = $_POST['apellido'];
  $fechaNacimiento = $_POST['fechaNacimiento'];
  $tipoUsuario = $_POST['tipoUsuario'];
  $genero = $_POST['genero'];
  $direccion = $_POST['direccion'];

  //Datos del usuario
  $user = $_POST['user'];
  $pass = $_POST['pass'];

  $usuarioDB = new ProcesosUsuarios();

  $guardado = $usuarioDB->RegistrarPersona($nombre,$apellido,$direccion,$genero,$tipoUsuario,$fechaNacimiento,$user,$pass);

  if($guardado){
    header("Location: ../login.php");
  }else{
    header("Location: ../registro.php");

  }

?>