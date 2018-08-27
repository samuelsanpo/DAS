
package adaptador;


public class AdministradorAdaptador extends Usuario{
    
    private final Administrador administrador;
    
    public AdministradorAdaptador() {
        this.administrador = new Administrador();
    }
    public void consultar() {
        boolean encontrado = false;
        for (int i = 0; i < this.getUsuarios().size(); i++) {
            if (this.getUsuarios().get(i) instanceof AdministradorAdaptador) {
                System.out.println(this.getUsuarios().get(i).toString());
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("Usuario no encontrado ");
        }
    }

     @Override
    public void eliminar(String correo) {
        for (int i = 0; i < this.getUsuarios().size(); i++) {
            if (this.getUsuarios().get(i).getCorreo().equals(correo)) {
                this.getUsuarios().remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " - Correo: " + this.getCorreo();
    }
}
