<?php include('header.php') ?>

<section class="pt-4">
  <div class="container px-lg-5">
    <h2>Registro de usuario</h2>
    <form action="procesos/reg.php" method="post">

      <div class="row">
        <div class="col-md-6">
          <div class="form-group">
            <label for="">Nombre</label>
            <input class="form-control" type="text" name="nombre" required>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group">
            <label for="">Apellido</label>
            <input class="form-control" type="text" name="apellido" required>
          </div>
        </div>
      </div>  
      <div class="row">
        <div class="col-md-6">
          <div class="form-group">
            <label for="">Fecha Nacimiento</label>
            <input class="form-control" type="date" name="fechaNacimiento" required>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group">
            <label for="">Direccion</label>
            <textarea class="form-control" name="direccion" required></textarea>
          </div>
        </div>
      </div>  
      <div class="row">
        <div class="col-md-6">
          <div class="form-group">
            <label for="">Genero</label>
            <select class="form-control" name="genero" required>
              <option value="0">Masculino</option>
              <option value="1">Femenino</option>
            </select>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group">
            <label for="">Tipo de usuario</label>
            <select class="form-control" name="tipoUsuario" required>
            <option value="1">Estudiante</option>
            <option value="2">Profesor</option>
            <option value="3">Administrador</option>
            </select>
          </div>
        </div>
      </div>  
      <div class="row">
        <div class="col-md-6">
          <div class="form-group">
            <label for="">Usuario</label>
            <input class="form-control" type="text" name="user" required>
          </div>
        </div>
        <div class="col-md-6">
          <div class="form-group">
            <label for="">Password</label>
            <input class="form-control" type="password" name="pass" required>
          </div>
        </div>
      </div>  

      <div class="row mb-5 mt-5">
        <button class="btn btn-success" type="submit">Registrar usuario</button>
      </div>

    </form>
  </div>
</section>

<?php include('footer.php') ?>