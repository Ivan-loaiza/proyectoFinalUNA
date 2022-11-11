
package Logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;


public class Jornada implements Serializable, Global{
    
    private int idJornada, horasNormales, horasExtras, idEmpleado;
    private Date fechaInicio, fechaFinal;

    public Jornada() {
    }

    
    public Jornada(int idJornada, int horasNormales, int horasExtras, int idEmpleado, Date fechaInicio, Date fechaFinal) {
        this.idJornada = idJornada;
        this.horasNormales = horasNormales;
        this.horasExtras = horasExtras;
        this.idEmpleado = idEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        
        jornadas.add(this);
    }

    
    
    public double calcularSalarioBruto(){
        int salarioHora= 0;
        
        for(Empleado empleado : empleados){
            if(idEmpleado == empleado.getIdPuesto()){
                salarioHora = empleado.devolverSalario();
            }
        }
        
        return salarioHora*horasExtras*horasNormales;
    }

    public int getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(int idJornada) {
        this.idJornada = idJornada;
    }

    public int getHorasNormales() {
        return horasNormales;
    }

    public void setHorasNormales(int horasNormales) {
        this.horasNormales = horasNormales;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    
    public static String ruta = System.getProperty("user.dir") + "\\src\\Data\\Jornadas.dat";
    DefaultTableModel modeloTablaJornadas = new DefaultTableModel();
    
    public void removerJornada(Jornada J1){
        
        for(int index=0 ; index <jornadas.size(); index++){
            if(jornadas.get(index) == J1)
            jornadas.remove(J1);
        }
        
    }
    
    public void editarJornada(int nuevasHoras, int nuevasHorasEx, int nuevoIdEmpleado, Date nuevaFechaInicio, Date nuevaFechaFinal, int index){
        Jornada J1 = new Jornada(jornadas.get(index).getIdJornada(), nuevasHoras, nuevasHorasEx, nuevoIdEmpleado, nuevaFechaInicio, nuevaFechaFinal);
        jornadas.set (index, J1);
        jornadas.remove(jornadas.size()-1);
    }
    
      public DefaultTableModel generarModeloTabla(){
         Object [] filas = new Object[2];
         
         
         modeloTablaJornadas = new DefaultTableModel();
         
         modeloTablaJornadas.addColumn("ID Jornada"); 
         modeloTablaJornadas.addColumn("Horas normales");
         modeloTablaJornadas.addColumn("Horas extras");
         modeloTablaJornadas.addColumn("Salario bruto");
         modeloTablaJornadas.addColumn("Fecha inicio");
         modeloTablaJornadas.addColumn("Fecha fin");
         modeloTablaJornadas.addColumn("ID Empleado");
         
         for(Jornada jornada : jornadas){
            
            String fechainicio = String.valueOf(jornada.getFechaInicio().getDay()) + "/" + String.valueOf(jornada.getFechaInicio().getMonth() +"/"+ String.valueOf(jornada.getFechaInicio().getYear()+1900));
            String fechafin = String.valueOf(jornada.getFechaFinal().getDay()) + "/" + String.valueOf(jornada.getFechaFinal().getMonth() +"/"+ String.valueOf(jornada.getFechaFinal().getYear()+1900));

             
            filas[0] = "" + jornada.getIdJornada();
            filas[1] = jornada.getHorasNormales();
            filas[2] = jornada.getHorasExtras();
            filas[3] = jornada.calcularSalarioBruto();
            filas[4] = fechainicio;
            filas[5] = fechafin;
            filas[6] = jornada.getIdEmpleado();
             
            modeloTablaJornadas.addRow(filas);
            
         }
         
         //Se limpian las filas con información basura
         for(int i = 0 ; i < modeloTablaJornadas.getRowCount() ; i++){
             if(modeloTablaJornadas.getValueAt(i, 0).toString().equals("0") == true ){
                 modeloTablaJornadas.removeRow(i);
             }
         }
         
         return modeloTablaJornadas;
     }
    
    public void guardarEnArchivo() {
        String archivo = "Jornadas.dat";
            try {
                
                ObjectOutputStream ficheroSalida = new ObjectOutputStream( new FileOutputStream(new File(ruta)));
                ficheroSalida.writeObject(jornadas);
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
                ArrayList<Jornada> temporal = (ArrayList<Jornada>) ficheroEntrada.readObject();
                jornadas.clear();
                jornadas.addAll(temporal);
                ficheroEntrada.close();
                
                for(Jornada jornada : jornadas){
                    System.out.print(jornada.idJornada + " / ");
                }
            }
        } catch (ClassNotFoundException cnfe) {

        } catch (FileNotFoundException fnfe) {

        } catch (IOException ioe) {

        }
     }
        
     public static boolean existeJornada(int id) {
        int len = jornadas.size();
        
        for (int i = 0; i < len; i++) {
            if (jornadas.get(i).getIdJornada()== id) {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean idDisponible(int id) {
        return !Jornada.existeJornada(id);
    }
     
     
     
     
     
    
    
    
}
