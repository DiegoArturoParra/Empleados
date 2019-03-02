package empresa;
import javax.swing.JOptionPane;

/**
 * @author Diego Parra
 */
public class Aplicacion 
{
    public static void main(String[] args) 
    {
        short opcion;
        short opcionIngresar;
        short opcionImprimir;
        Empleado employee1 = new Empleado();
	Empleado employee2 = new Empleado();
	Empleado employee3 = new Empleado();
	Empleado employee4 = new Empleado();
	Empleado employee5 = new Empleado();
        
        do 
        {
            opcion = Short.parseShort(JOptionPane.showInputDialog("------Menú-----\n"
                    + " 1. Ingresar datos de Empleados.\n"
                    + " 2. Mostrar datos de Empleados. \n"
                    + " 0. Salir.\n"
                    +"\nIngrese una opción:"));
             switch (opcion) 
             {
                 case 1:
                      opcionIngresar = Short.parseShort(JOptionPane.showInputDialog(" 1. Ingresar datos del empleado 1.\n"
                              + " 2. Ingresar datos del empleado 2.\n"
                              + " 3. Ingresar datos del empleado 3.\n"
                              + " 4. Ingresar datos del empleado 4.\n"
                              + " 5. Ingresar datos del empleado 5.\n"
                              + "\nIngrese la opción: "));
                      switch (opcionIngresar) // Switch case para ingresar datos del empleado
                      {
                          case 1:
                              employee1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
                              employee1.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad: ")));
                              employee1.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección: "));
                              employee1.setTelefono(JOptionPane.showInputDialog("Ingrese el teléfono: "));
                              break;
                          case 2: 
                              employee2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
                              employee2.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad: ")));
                              employee2.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección: "));
                              employee2.setTelefono(JOptionPane.showInputDialog("Ingrese el teléfono: "));
                              break;
                          case 3: 
                              employee3.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
                              employee3.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad: ")));
                              employee3.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección: "));
                              employee3.setTelefono(JOptionPane.showInputDialog("Ingrese el teléfono: "));
                              break;
                          case 4:
                              employee4.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
                              employee4.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad: ")));
                              employee4.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección: "));
                              employee4.setTelefono(JOptionPane.showInputDialog("Ingrese el teléfono: "));
                              break;
                          case 5:
                              employee5.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
                              employee5.setEdad(Short.parseShort(JOptionPane.showInputDialog("Ingrese la edad: ")));
                              employee5.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección: "));
                              employee5.setTelefono(JOptionPane.showInputDialog("Ingrese el teléfono: "));
                              break;
                          default:
                             throw new AssertionError();
                      }
                     break;
                 case 2:
                      opcionImprimir = Short.parseShort(JOptionPane.showInputDialog("1. Imprimir datos del empleado 1.\n"
                              + " 2. Imprimir datos del empleado 2.\n"
                              + " 3. Imprimir datos del empleado 3.\n"
                              + " 4. Imprimir datos del empleado 4.\n"
                              + " 5. Imprimir datos del empleado 5.\n"
                              + "\nIngrese la opción: "));
                      switch (opcionImprimir)  // Switch case para imprimir datos del empleado
                      {
                         case 1:
                             JOptionPane.showMessageDialog(null, "Nombre: " + employee1.getNombre() 
                                             + "\n Edad: " + employee1.getEdad()
                                             + "\n Dirección: " + employee1.getDireccion()
                                             + "\n Teléfono: " + employee1.getTelefono());
                             break;
                         case 2:
                             JOptionPane.showMessageDialog(null, "Nombre: " + employee2.getNombre() 
                                             + "\n Edad: " + employee2.getEdad()
                                             + "\n Dirección: " + employee2.getDireccion()
                                             + "\n Teléfono: " + employee2.getTelefono());
                             break;
                         case 3:
                             JOptionPane.showMessageDialog(null, "Nombre: " + employee3.getNombre() 
                                             + "\n Edad: " + employee3.getEdad()
                                             + "\n Dirección: " + employee3.getDireccion()
                                             + "\n Teléfono: " + employee3.getTelefono());
                             break;
                         case 4:
                             JOptionPane.showMessageDialog(null, "Nombre: " + employee4.getNombre() 
                                             + "\n Edad: " + employee4.getEdad()
                                             + "\n Dirección: " + employee4.getDireccion()
                                             + "\n Teléfono: " + employee4.getTelefono());
                             break;
                         case 5:
                             JOptionPane.showMessageDialog(null, "Nombre: " + employee5.getNombre() 
                                             + "\n Edad: " + employee5.getEdad()
                                             + "\n Dirección: " + employee5.getDireccion()
                                             + "\n Teléfono: " + employee5.getTelefono());
                             break;
                         default:
                             throw new AssertionError();
                      }
                     break;
             }
        } while (opcion != 0);
    }
}
