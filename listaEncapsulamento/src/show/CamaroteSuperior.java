package show;

public class CamaroteSuperior extends VIP {
    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor, valorAdicional);
    }

    public void imprimeValor() {
        System.out.println("Valor do Ingresso VIP - Camarote Superior: R$" + (super.valor + super.valorAdicional));
    }
}