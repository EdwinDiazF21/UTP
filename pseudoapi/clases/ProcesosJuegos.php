<?php 
  class ProcesosJuegos{

    function ObtenerTodosLosJuegos(){
      $con = new Conexion();

      $query = "CALL ObtenerTodosjuegos()";
      $allJuegos = mysqli_query($con->Conectar(),$query);
      $countRows = mysqli_num_rows($allJuegos);
      if($countRows > 0){
        $datos = array();
        while($row = mysqli_fetch_assoc($allJuegos)){
            $datos[] = $row;
        }
        return $datos;
      }
      return [];
    }

    function ObtenerPreguntas($jid, $nid){
      $con = new Conexion();

      $query = "CALL MFDD_ObtenerPreguntas('{$jid}','{$nid}')";
      $allPreguntas = mysqli_query($con->Conectar(),$query);
      $countRows = mysqli_num_rows($allPreguntas);
      if($countRows > 0){
        $datos = array();
        while($row = mysqli_fetch_assoc($allPreguntas)){
            //var_dump($row['id']);
            $row['respuestas'] = $this->ObtenerRespuestas($row['id']);
            $datos[] = $row;
        }
        return $datos;
      }
      return [];
    }

    function ObtenerRespuestas($prgid){
      $con = new Conexion();

      $query = "CALL ObtenerRespuestasByPregunta('{$prgid}')";
      $allRespuestas = mysqli_query($con->Conectar(),$query);
      $countRows = mysqli_num_rows($allRespuestas);
      if($countRows > 0){
        $datos = array();
        while($row = mysqli_fetch_assoc($allRespuestas)){
            $datos[] = $row;
        }
        return $datos;
      }
      return [];
    }

    function ObtenerPosciiones(){
      $con = new Conexion();

      $query = "CALL MFDD_Ranking()";
      $allTabla = mysqli_query($con->Conectar(),$query);
      $countRows = mysqli_num_rows($allTabla);
      if($countRows > 0){
        $datos = array();
        while($row = mysqli_fetch_assoc($allTabla)){
            $datos[] = $row;
        }
        return $datos;
      }
      return [];
    }

    function ObtenerNiveles(){
      $con = new Conexion();
  
      $query = "CALL ObtenerNivel()";
      $allNiveles = mysqli_query($con->Conectar(),$query);
      $countRows = mysqli_num_rows($allNiveles);
      if($countRows > 0){
        $datos = array();
        while($row = mysqli_fetch_assoc($allNiveles)){
            $datos[] = $row;
        }
        return $datos;
      }
      return [];
    }

    

    /*function ObtenerRanking(){
      $con = new Conexion();

      $query = "CALL MFDD_Ranking()";
      $allRanking = mysqli_query($con->Conectar(),$query);
      $countRows = mysqli_num_rows($allRanking);
      if($countRows > 0){
        $datos = array();
        while($row = mysqli_fetch_assoc($allRanking)){
            $datos[] = $row;
        }
        return $datos;
      }
      return [];
    }*/

    

    function InsertarPartida($jg,$ju,$p,$n,$f,$h,$pt,$d){
      $con = new Conexion();

      $query ="CALL InsertarPartida('{$jg}','{$ju}','{$p}','{$n}','{$f}','{$h}','{$pt}','{$d}')";
      var_dump($query);
      return mysqli_query($con->Conectar(),$query);
    }

  }
?>