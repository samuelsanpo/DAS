
package adaptador;


public class Conductor extends Usuario {
    
    public void consultar() {

        boolean encontrado = false;
        for (int i = 0; i < this.getUsuarios().size(); i++) {
            if (this.getUsuarios().get(i) instanceof Conductor) {
                System.out.println(this.getUsuarios().get(i).toString());
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("Conductor no encontrado");
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
