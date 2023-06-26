package produtos;

public class ProdutoUsado extends Produto {
    private String dataFabricacao;

    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    @Override
    public String getPrecoTag() {
        return getNome() + " (usado) R$ " + String.format("%.2f", getPreco()) +
                " (Data de fabricação: " + dataFabricacao + ")";
    }
}
