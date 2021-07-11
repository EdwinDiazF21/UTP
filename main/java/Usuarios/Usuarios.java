package Usuarios;

public class Usuarios {
    private int id;
    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellido;
    private int tipoUsuario;

    public Usuarios(int id, String usuario, String contrasena, String nombre, String apellido, int tipoUsuario){
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoUsuario = tipoUsuario;
    }

    public String getUser() {
        return usuario;
    }

    public String getPassword() {
        return contrasena;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido(){return apellido;}

    public int getTipo(){return tipoUsuario;}
}