package produtos;

public class ProdutoImportado extends Produto {
    private double taxaImportacao;

    public ProdutoImportado(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    @Override
    public String getPrecoTag() {
        double precoTotal = getPreco() + taxaImportacao;
        return getNome() + " R$ " + String.format("%.2f", getPreco()) +
                " (Taxa de importação: R$ " + String.format("%.2f", taxaImportacao) +
                ")\nTotal: R$ " + String.format("%.2f", precoTotal);
    }
}
