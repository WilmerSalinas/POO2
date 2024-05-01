package problema3;
public class Problema3 {
    public static void main(String[] args) {
        
        CaracteristicasV cv = new CaracteristicasV();
        cv.calcularValor_de_la_matricula();
        System.out.printf("%s\n", cv);

        CaracteristicasV CaracteristicasV2 = new CaracteristicasV(1103291082, "AUDI" , 2005, 25000);
        CaracteristicasV2.calcularValor_de_la_matricula();
        System.out.printf("%s\n", CaracteristicasV2);
    }
}
