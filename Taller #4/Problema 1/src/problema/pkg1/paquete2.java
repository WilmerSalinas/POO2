package problema.pkg1;

public class paquete2 {
    
    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double promedioCalificaciones;
    private String NombreU;
    private String Dir;
    
    
    public paquete2() {
        nombreEstudiante = "Juan Carlos";
        calificacionMateria1 = 8.80;
        calificacionMateria2 = 9.80;
        calificacionMateria3 = 9.00;
    }

    public paquete2(String nombreEstudiante, double calificacionMateria1, double calificacionMateria2, double calificacionMateria3, String NombreU, String Dir) {
        this.nombreEstudiante = nombreEstudiante;
        this.calificacionMateria1 = calificacionMateria1;
        this.calificacionMateria2 = calificacionMateria2;
        this.calificacionMateria3 = calificacionMateria3;
        this.NombreU = NombreU;
        this.Dir = Dir;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double getCalificacionMateria1() {
        return calificacionMateria1;
    }

    public void setCalificacionMateria1(double calificacionMateria1) {
        this.calificacionMateria1 = calificacionMateria1;
    }

    public double getCalificacionMateria2() {
        return calificacionMateria2;
    }

    public void setCalificacionMateria2(double calificacionMateria2) {
        this.calificacionMateria2 = calificacionMateria2;
    }

    public double getCalificacionMateria3() {
        return calificacionMateria3;
    }

    public void setCalificacionMateria3(double calificacionMateria3) {
        this.calificacionMateria3 = calificacionMateria3;
    }

    public double getPromedioCalificaciones() {
        return promedioCalificaciones;
    }

    public String getNombreU() {
        return NombreU;
    }

    public void setNombreU(String NombreU) {
        this.NombreU = NombreU;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }
    
    
    public void calcularPromedio() {
        double suma = calificacionMateria1 + calificacionMateria2 
                + calificacionMateria3;
        promedioCalificaciones = suma / 3;
    }
    
    @Override
        public String toString() {
        String cadena = String.format("""
                                      Calificaciones del Estudiante
                                      Nombre Estudiante: %s
                                      Calificacion Materia 1: %.2f
                                      Calificacion Materia 2: %.2f
                                      Calificacion Materia 3: %.2f
                                      Promedio de Calificaciones: %.2f
                                      Nombre de la UNIVERSIDAD: %.2F
                                      Direccion del Estudiante: %.2f""",
                                      nombreEstudiante,
                                      calificacionMateria1,
                                      calificacionMateria2,
                                      calificacionMateria3,
                                      promedioCalificaciones,
                                      NombreU,
                                      Dir);
                
        

        return cadena;
   } 
}
