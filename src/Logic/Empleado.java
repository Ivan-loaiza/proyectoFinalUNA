/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Juan
 */

import java.util.Vector;

public class Empleado {
    private int id;
    private String nombre;
    private String correo;
    private String telefono;
    private int id_puesto;

    public Empleado(int id, String nombre, String correo, String telefono, int id_puesto) 
        throws IllegalArgumentException {
        if (Empleado.idDisponible(id) == false) {
            throw new IllegalArgumentException("La ID de empleado ya está en uso");
        }
        if (Puesto.existePuesto(id_puesto) == false) {
            throw new IllegalArgumentException("El ID del puesto al que se refiere no existe");
        }
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.id_puesto = id_puesto;
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

    public int getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(int id_puesto) {
        this.id_puesto = id_puesto;
    }
    
    public static Vector<Empleado> empleados = new Vector<>();
    
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
