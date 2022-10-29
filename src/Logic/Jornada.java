
package Logic;


public class Jornada implements Global{
    
    private int idJornada, horasNormales, horasExtras, idEmpleado;
    private String fechaInicio, fechaFinal;

    public Jornada(int idJornada, int horasNormales, int horasExtras, int idEmpleado, String fechaInicio, String fechaFinal) {
        this.idJornada = idJornada;
        this.horasNormales = horasNormales;
        this.horasExtras = horasExtras;
        this.idEmpleado = idEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        
        jornadas.add(this);
    }

    
    /*
    public double calcularSalarioBruto(){S
        int salarioHora= empleado.getPuesto().getSalario();
        
        return salarioHora*horasExtras*horasNormales;
    }*/

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


    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    
    
    
}
