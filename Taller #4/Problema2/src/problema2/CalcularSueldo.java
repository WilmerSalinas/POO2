package problema2;

public class CalcularSueldo {
    
    private String nombre;
    private String apellido;
    private int cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    
    public CalcularSueldo() {
    nombre = "Luis Antonio";
    apellido = "Ortiz Armijos";
    cedula = 1727124996;
    sueldoBasico = 320.00;
    
    }

    public CalcularSueldo(String nombre, String apellido, int cedula, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }
    
    public void calcularSueldoTotal() {
        double iva = (sueldoBasico * 20) / 100;
        sueldoTotal = sueldoBasico + iva;
    }    
    
    @Override
     public String toString() {
        String cadena = String.format("""
                                      Sueldo de un Profesor
                                      Nombre: %s
                                      Apellido: %s
                                      Cedula: %d
                                      Sueldo Basico: %.2f
                                      Sueldo Total: %.2f""",
                                  nombre,
                                  apellido,
                                  cedula,
                                  sueldoBasico,
                                  sueldoTotal);
        return cadena;
    }
    
}
