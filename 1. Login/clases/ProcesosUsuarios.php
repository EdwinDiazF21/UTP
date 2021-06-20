<?php
class ProcesosUsuarios{
  
  function RegistrarPersona($n,$a,$d,$g,$tu,$fn,$u,$p){
    $con = new Conexion();

    $query = "CALL CrearPersonaUsuario('{$n}','{$a}','{$d}','{$g}',{$tu},{$fn},'{$u}','{$p}')";

    return mysqli_query($con->Conectar(),$query);
  }

  function ValidarUsuario($u,$p){
    $con = new Conexion();

    $userExist = mysqli_query($con->Conectar(),"SELECT * FROM usuarios WHERE username='".$u."'");
    $countRows = mysqli_num_rows($userExist);
    var_dump($userExist);
    if($userExist){
      $query = "CALL VerificarUsuario('{$u}','{$p}')";
      $login = mysqli_query($con->Conectar(),$query);
      $countRows = mysqli_num_rows($login);
      if($countRows > 0){
        return mysqli_fetch_object($login);
      }      
    }
    return null;
  }

}
?>