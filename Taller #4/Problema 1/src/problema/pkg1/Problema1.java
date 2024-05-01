package problema.pkg1;

public class Problema1 {
    public static void main(String[] args) {
        // objeto 1
        paquete2 calificaciones1 = new paquete2();
        calificaciones1.calcularPromedio();
        System.out.printf("%s\n", calificaciones1);

        // objeto 2 
        paquete2 calificaciones2 = new paquete2
        ( "Jostin Gutierres", 9.00, 8.50, 10.00, "UTPL", "Las pitas");
        calificaciones2.calcularPromedio();
        System.out.println("--------------------------------");
        System.out.printf("%s\n", calificaciones2);

    }
}

    
    

