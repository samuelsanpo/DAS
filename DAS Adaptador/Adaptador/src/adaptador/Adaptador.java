
package adaptador;

import javax.swing.JOptionPane;


public class Adaptador {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario;
        
       

        while (true) {
           int opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione un rol: \n\n"
                    + "1.Administrador\n" + "2.Conductor\n" + "3.Pasajero\n" + "4.Salir"
            ));
            switch (opc) {
                case 1:
                    usuario = new AdministradorAdaptador();

                    int opc2 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Seleccione una opción: \n\n"
                            + "1.crear administrador\n" + "2.consultar administrador\n" + "3.modificar administrador\n" + "4.Eliminar administrador"
                    ));
                    switch (opc2) {
                        case 1:
                            String nombreAd = JOptionPane.showInputDialog("Ingrese el nombre del administrador: ");
                            String contraseñaAd = JOptionPane.showInputDialog("Ingrese la contraseña del administrador: ");
                            String correoAd = JOptionPane.showInputDialog("Ingrese el correo del administrador: ");
                            String rolAd = "Administrador";
                            usuario.adicionar(nombreAd, contraseñaAd, correoAd, rolAd);
                            break;
                        case 2:
                            for(int i=0; i<usuario.getUsuarios().size();i++){
                                String rol = usuario.getUsuarios().get(i).getRol();
                                if(rol.equals("Administrador")){
                            JOptionPane.showMessageDialog(null, usuario.getUsuarios().get(i));
                                }
                            }
                            break;
                        case 3:
                            String correoModificarAd = JOptionPane.showInputDialog("Ingrese el correo del administrador que quiere modificar: ");
                            String nombreNuevoAd = JOptionPane.showInputDialog("Ingrese el nuevo nombre: ");
                            String contraseñaNuevaAd = JOptionPane.showInputDialog("Ingrese la nueva contraseña: ");
                            usuario.modificar(nombreNuevoAd, contraseñaNuevaAd, correoModificarAd);
                            break;
                        case 4:
                            String correoEliminarAd = JOptionPane.showInputDialog("Ingrese el correo del administrador que quiere eliminar: ");
                            usuario.eliminar(correoEliminarAd);
                            break;
                            
                    }

                    break;

                case 2:
                    
                      usuario = new Conductor();

                    int opc3 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Seleccione una opción: \n\n"
                            + "1.crear conductor\n" + "2.consultar conductor\n" + "3.modificar conductor\n" + "4.Eliminar conductor"
                    ));
                    switch (opc3) {
                        case 1:
                            String nombreCo = JOptionPane.showInputDialog("Ingrese el nombre del conductor: ");
                            String contraseñaCo = JOptionPane.showInputDialog("Ingrese la contraseña del conductor: ");
                            String correoCo = JOptionPane.showInputDialog("Ingrese el correo del conductor: ");
                            String rolCo = "Conductor";
                            usuario.adicionar(nombreCo, contraseñaCo, correoCo, rolCo);
                            break;
                        case 2:
                            for(int i=0; i<usuario.getUsuarios().size();i++){
                                String rol = usuario.getUsuarios().get(i).getRol();
                                if(rol.equals("Conductor")){
                            JOptionPane.showMessageDialog(null, usuario.getUsuarios().get(i));
                                }
                            }
                            break;
                        case 3:
                            String correoModificarCo = JOptionPane.showInputDialog("Ingrese el correo del conductor que quiere modificar: ");
                            String nombreNuevoCo = JOptionPane.showInputDialog("Ingrese el nuevo nombre: ");
                            String contraseñaNuevaCo = JOptionPane.showInputDialog("Ingrese la nueva contraseña: ");
                            usuario.modificar(nombreNuevoCo, contraseñaNuevaCo, correoModificarCo);
                            break;
                        case 4:
                            String correoEliminar = JOptionPane.showInputDialog("Ingrese el correo del conductor que quiere eliminar: ");
                            usuario.eliminar(correoEliminar);
                            break;
                    }
                    break;
                case 3:
                    
                     usuario = new Pasajero();

                    int opc4 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Seleccione una opción: \n\n"
                            + "1.crear pasajero\n" + "2.consultar pasajero\n" + "3.modificar pasajero\n" + "4.Eliminar pasajero"
                    ));
                    switch (opc4) {
                        case 1:
                            String nombrePa = JOptionPane.showInputDialog("Ingrese el nombre del pasajero: ");
                            String contraseñaPa = JOptionPane.showInputDialog("Ingrese la contraseña del pasajero: ");
                            String correoPa = JOptionPane.showInputDialog("Ingrese el correo del pasajero: ");
                            String rolPa = "Pasajero";
                            usuario.adicionar(nombrePa, contraseñaPa, correoPa, rolPa);
                            break;
                        case 2:
                            for(int i=0; i<usuario.getUsuarios().size();i++){
                                String rol = usuario.getUsuarios().get(i).getRol();
                                if(rol.equals("Pasajero")){
                            JOptionPane.showMessageDialog(null, usuario.getUsuarios().get(i));
                                }
                            }
                            break;
                        case 3:
                            String correoModificarPa = JOptionPane.showInputDialog("Ingrese el correo del pasajero que desea modificar: ");
                            String nombreNuevoPa = JOptionPane.showInputDialog("Ingrese el nombre nuevo: ");
                            String contraseñaNuevaPa = JOptionPane.showInputDialog("Ingrese la contraseña nueva: ");
                            usuario.modificar(nombreNuevoPa, contraseñaNuevaPa, correoModificarPa);
                            break;
                        case 4:
                            String correoEliminarPa = JOptionPane.showInputDialog("Ingrese el correo del pasajero que desea eliminar: ");
                            usuario.eliminar(correoEliminarPa);
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
                    
            }
        }
    }
    
}
