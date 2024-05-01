package problema2;
public class Problema2 {
    public static void main(String[] args) {
        
        
      CalcularSueldo calcularSueldo1 = new CalcularSueldo();
        calcularSueldo1.calcularSueldoTotal();
        System.out.printf("%s\n", calcularSueldo1);

        CalcularSueldo calcularSueldo2 = new CalcularSueldo
        ("Carlos Andres", "Cuenca Uchuari", 11010446, 500);
        calcularSueldo2.calcularSueldoTotal();
        System.out.println("--------------------------------");
        System.out.printf("%s\n", calcularSueldo2);

    }

}
        