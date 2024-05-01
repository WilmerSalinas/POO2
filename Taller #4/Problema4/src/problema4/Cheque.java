package problema4;

public class Cheque {
    private String nombre_del_cliente;
    private String nombre_del_banco;
    private double valor_del_cheque;
    private double comisión_del_banco;
    
        public Cheque() {
        nombre_del_cliente = "Andrés";
        nombre_del_banco = "Banco de Loja";
        valor_del_cheque = 1000;
    }

    public Cheque(String nombre_del_cliente, String nombre_del_banco, double valor_del_cheque) {
        this.nombre_del_cliente = nombre_del_cliente;
        this.nombre_del_banco = nombre_del_banco;
        this.valor_del_cheque = valor_del_cheque;
    }
    
    

    public String getNombre_del_cliente() {
        return nombre_del_cliente;
    }

    public void setNombre_del_cliente(String nombre_del_cliente) {
        this.nombre_del_cliente = nombre_del_cliente;
    }

    public String getNombre_del_banco() {
        return nombre_del_banco;
    }

    public void setNombre_del_banco(String nombre_del_banco) {
        this.nombre_del_banco = nombre_del_banco;
    }

    public double getValor_del_cheque() {
        return valor_del_cheque;
    }

    public void setValor_del_cheque(double valor_del_cheque) {
        this.valor_del_cheque = valor_del_cheque;
    }

    public double getComisión_del_banco() {
        return comisión_del_banco;
    }

    public void calcularComisión_del_banco() {
        comisión_del_banco = 0.003 * valor_del_cheque;
    }


    @Override
    public String toString() {
        String cadena = String.format("""
                                      Informacion del Banco.
                                      Nombre del cliente: %s
                                      Nombre del banco: %s
                                      Valor del cheque : %.2f
                                      Comision del banco: %.2f
                                      
                                      """,
                nombre_del_cliente, nombre_del_banco,
                valor_del_cheque, comisión_del_banco);
        return cadena;

    }

}
    
