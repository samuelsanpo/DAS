
package adaptador;


public class Administrador {
    public void brief() {
       System.out.println("Se elimino el administrador");
    }

    public void delete() {
        System.out.println("Se elimino administrador");
    }

    @Override
    public String toString() {
        return "Administrador"; //To change body of generated methods, choose Tools | Templates.
    }
}
