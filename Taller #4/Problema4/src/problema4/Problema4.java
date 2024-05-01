package problema4;

public class Problema4 {
    public static void main(String[] args) {
         Cheque cc = new Cheque();
        cc.calcularComisión_del_banco();
        System.out.printf("%s\n", cc);
        
        Cheque Cheque2 = new Cheque("Roberto", "Banco de Pichincha", 25000);
        Cheque2.calcularComisión_del_banco();
        System.out.printf("%s\n", Cheque2);

    }

}