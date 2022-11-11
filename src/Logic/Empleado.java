
package Logic;

/**
 *
 * @author Juan
 */

import java.io.Serializable;
import java.util.Vector;

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
    
}
