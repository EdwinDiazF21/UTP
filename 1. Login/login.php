<?php include('header.php') ?>

<section class="pt-4">
  <div class="container px-lg-5">
    <h2>Iniciar Session</h2>
    <form action="procesos/log.php" method='post'>
      <div class="row">
        <div class="col-md-12">
          <div class="form-group">
            <label for="">Usuario</label>
            <input class='form-control' type="text" name="user" require>
          </div>
          <div class="form-group">
            <label for="">Contrasena</label>
            <input class='form-control' type="password" name="pass" require>
          </div>
        </div>
      </div>
      <div class="row mb-5 mt-5">
        <button class="btn btn-warning btn-block">Iniciar Session</button>
      </div>
    </form>
  </div>
</section>
<?php include('footer.php') ?>