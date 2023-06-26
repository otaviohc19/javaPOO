package produtos;

public class ProdutoComum extends Produto {
    public ProdutoComum(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String getPrecoTag() {
        return getNome() + " R$ " + String.format("%.2f", getPreco());
    }
}
