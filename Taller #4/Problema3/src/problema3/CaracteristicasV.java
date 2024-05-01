package problema3;
public class CaracteristicasV {
    
    private int cédula_del_dueño;
    private String marca_de_vehículo;
    private int año_de_fabricación;
    private double valor_de_vehículo;
    private double valor_de_la_matricula;
    
    public CaracteristicasV() {
      cédula_del_dueño = 1107736544;
      marca_de_vehículo = "TOYOTA";
      año_de_fabricación = 2004;
      valor_de_vehículo = 15000;
    }

    public CaracteristicasV(int cédula_del_dueño, String marca_de_vehículo, int año_de_fabricación, double valor_de_vehículo) {
        this.cédula_del_dueño = cédula_del_dueño;
        this.marca_de_vehículo = marca_de_vehículo;
        this.año_de_fabricación = año_de_fabricación;
        this.valor_de_vehículo = valor_de_vehículo;
    }

    public int getCédula_del_dueño() {
        return cédula_del_dueño;
    }

    public void setCédula_del_dueño(int cédula_del_dueño) {
        this.cédula_del_dueño = cédula_del_dueño;
    }

    public String getMarca_de_vehículo() {
        return marca_de_vehículo;
    }

    public void setMarca_de_vehículo(String marca_de_vehículo) {
        this.marca_de_vehículo = marca_de_vehículo;
    }

    public int getAño_de_fabricación() {
        return año_de_fabricación;
    }

    public void setAño_de_fabricación(int año_de_fabricación) {
        this.año_de_fabricación = año_de_fabricación;
    }

    public double getValor_de_vehículo() {
        return valor_de_vehículo;
    }

    public void setValor_de_vehículo(double valor_de_vehículo) {
        this.valor_de_vehículo = valor_de_vehículo;
    }

    public double getValor_de_la_matricula() {
        return valor_de_la_matricula;
    }

    public void calcularValor_de_la_matricula() {
        double x;
        x = 0.002 * valor_de_vehículo;
        valor_de_la_matricula = x * año_de_fabricación;
    
    }
    @Override
        public String toString() {
        String cadena = String.format("""
                                      Caracteristicas del vehiculo.
                                      Numero de cedula del dueño: %d
                                      Marca del vehiculo: %s
                                      A\u00f1o del vehiculo: %d
                                      valor del vehiculo: %.2f
                                      valor de la matricula: %.2f\n
                                      """, 
                                  cédula_del_dueño, marca_de_vehículo,
                                  año_de_fabricación, valor_de_vehículo,
                                  valor_de_la_matricula);
        return cadena;

    }
}
