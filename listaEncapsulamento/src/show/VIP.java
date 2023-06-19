package show;

public class VIP extends Ingresso {
    protected double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void imprimeValor() {
        System.out.println("Valor do Ingresso VIP: R$" + (super.valor + valorAdicional));
    }
}