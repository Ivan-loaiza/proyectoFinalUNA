

package Logic;

import java.util.ArrayList;


public interface Global {
    String user = "admin";
    char [] password = new char [10];
    
    public ArrayList<Departamento> departamentos = new ArrayList<>();
    public ArrayList<Puesto> puestos = new ArrayList<>();
    public ArrayList<Empleado> empleados = new ArrayList<>();
    public ArrayList<Jornada> jornadas = new ArrayList<>();
    public ArrayList<User> usuarioAjuste = new ArrayList<>();
    
}
