
package Logic;

/**
 *
 * @author Juan
 */

import static Logic.Global.departamentos;
import static Logic.Global.puestos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Empleado implements Serializable,Global{
    private int id;
    private String nombre;
    private String correo;
    private String telefono;
    private int idPuesto;
    
    
    public Empleado() {
    }

    
    
    public Empleado(int id, String nombre, String correo, String telefono, int idPuesto) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.idPuesto = idPuesto;
        
        empleados.add(this);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public int devolverSalario(){
        
        int salario=0;
        
            for(Puesto puesto : puestos){
                if(idPuesto == puesto.getId()){
                    salario = puesto.getSalario();
                }
            }
    
        return salario;
    }
    

   
    
    public static boolean existeEmpleado(int id) {
        int len = empleados.size();
        
        for (int i = 0; i < len; i++) {
            if (empleados.get(i).getId() == id) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean idDisponible(int id) {
        return !Empleado.existeEmpleado(id);
    }
    
    public static Empleado getEmpleado(int id) {
        int len = empleados.size();
        
        for (int i = 0; i < len; i++) {
            if (empleados.get(i).getId() == id) {
                return empleados.get(i);
            }
        }
        
        return null;
    }
    
    
     public static String ruta = System.getProperty("user.dir") + "\\src\\Data\\Empleados.dat";
     DefaultTableModel modeloTablaEmpleados = new DefaultTableModel();
     DefaultComboBoxModel modeloComboBoxPuestos = new  DefaultComboBoxModel();
    
    public void removerEmpleado(Empleado P1){
        
        for(int index=0 ; index < empleados.size(); index++){
            if(empleados.get(index) == P1)
            empleados.remove(P1);
        }
    }
    
    public void editarEmpleado(String nuevoNombre,String NuevoCorreo ,String NuevoTelefono ,int NuevoIdPuesto , int index){
        Empleado P1 = new Empleado(empleados.get(index).getId() , nuevoNombre,NuevoCorreo , NuevoTelefono, NuevoIdPuesto );
        empleados.set(index, P1);
        empleados.remove(empleados.size()-1);
    }
    
     public DefaultTableModel generarModeloTabla(){
         Object [] filas = new Object[5];
         
         modeloTablaEmpleados = new DefaultTableModel();
         modeloTablaEmpleados.addColumn("ID Empleado"); 
         modeloTablaEmpleados.addColumn("Nombre");
         modeloTablaEmpleados.addColumn("Correo");
         modeloTablaEmpleados.addColumn("Telefono");
         modeloTablaEmpleados.addColumn("ID Puesto"); 
         
         for(Empleado empleado : empleados){
            filas[0] = "" + empleado.getId();
            filas[1] = empleado.getNombre();
            filas[2] = empleado.getCorreo();
            filas[3] = empleado.getTelefono();
            filas[4] = empleado.getIdPuesto();
            
            modeloTablaEmpleados.addRow(filas);
         }
         
         //Se limpian las filas con información basura
         for(int i = 0 ; i < modeloTablaEmpleados.getRowCount() ; i++){
             if(modeloTablaEmpleados.getValueAt(i, 0).toString().equals("0") == true ){
                 modeloTablaEmpleados.removeRow(i);
             }
         }
         
         return modeloTablaEmpleados;
     }
     
    public DefaultComboBoxModel generarModeloComboBox(){
        modeloComboBoxPuestos = new DefaultComboBoxModel();
        modeloComboBoxPuestos.addElement("--Seleccione una opcion--");
        for(Puesto puesto : puestos){
            modeloComboBoxPuestos.addElement(puesto.getId());
        }
        
        return modeloComboBoxPuestos;
    }
    
    public void guardarEnArchivo() {
        String archivo = "Empleados.dat";
            try {
                ObjectOutputStream ficheroSalida = new ObjectOutputStream(
                        new FileOutputStream(new File(ruta)));
                ficheroSalida.writeObject(empleados);
                ficheroSalida.flush();
                ficheroSalida.close();
                System.out.println("Datos de guardados correctamente en " + archivo + ".");
            } catch (FileNotFoundException fnfe) {
                System.out.println("Error: El fichero " + archivo + " no existe. ");
            } catch (IOException ioe) {
                System.out.println("Error: Fallo la escritura en el fichero" + archivo + ". ");
            }
    }
    
     public void recuperarDeArchivo() {
        try {
            File fichero = new File(ruta);
            if (fichero.exists()) {
                ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
                ArrayList<Empleado> temporal = (ArrayList<Empleado>) ficheroEntrada.readObject();
                empleados.clear();
                empleados.addAll(temporal);
                ficheroEntrada.close();
                
               
            }
        } catch (ClassNotFoundException cnfe) {

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }
     }
    
}
