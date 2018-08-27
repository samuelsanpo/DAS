
package adaptador;

import java.util.ArrayList;


public abstract class Usuario {
    
    private static final ArrayList<Usuario> Usuarios = new ArrayList<>();
    private String Nombre;
    private String  Contraseña;
    private String Correo;
    private String Rol;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        this.Contraseña = contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }
    
    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        this.Rol = rol;
    }
    
    
    public void adicionar(String nombre, String contraseña, String correo, String rol) {
        this.Nombre = nombre;
        this.Contraseña = contraseña;
        this.Correo = correo;
        this.Rol=rol;
        this.Usuarios.add(this);
    };
    public void modificar(String nombre, String contraseña, String correo) {
        for (int i = 0; i < this.getUsuarios().size(); i++) {
            if (this.getUsuarios().get(i).getCorreo().equals(correo)) {
                this.getUsuarios().get(i).setNombre(nombre);
                this.getUsuarios().get(i).setContraseña(contraseña);
            }
        }
    };
    public void mostrarUsuarios() {
        Usuarios.forEach((us) -> {
            System.out.println(us);
        });
    };
    abstract public void consultar();
    abstract public void eliminar(String correo);
   
    protected ArrayList<Usuario> getUsuarios() {
        return this.Usuarios;
    }
}
    

