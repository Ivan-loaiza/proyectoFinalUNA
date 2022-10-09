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

public class Puesto {
    private int id;
    private String nombre;
    private int salario;
    private Departamento departamento;
    
    public Puesto(int id, String nombre, int salario, Departamento departamento)
     throws IllegalArgumentException {
        if (Puesto.idDisponible(id) == false) {
            throw new IllegalArgumentException("ID de puesto ya está en uso");
        }
        if (Departamento.existeDepartamento(departamento.getId()) == false) {
            throw new IllegalArgumentException("La ID del departamento no se refiere a ningún departamento existente");
        }
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public static Vector<Puesto> getPuestos() {
        return puestos;
    }

    public static void setPuestos(Vector<Puesto> puestos) {
        Puesto.puestos = puestos;
    }
    
    
    
    public static Vector<Puesto> puestos = new Vector<>();
    
    public static boolean existePuesto(int id) {
        int len = puestos.size();
        
        for (int i = 0; i < len; i++) {
            if (puestos.get(i).getId() == id) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean idDisponible(int id) {
        return !Puesto.existePuesto(id);
    }
    
    public static Puesto GetPuesto(int id) {
        int len = puestos.size();
        
        for (int i = 0; i < len; i++) {
            if (puestos.get(i).getId() == id) {
                return puestos.get(i);
            }
        }
    
        return null;
    }
   
}
