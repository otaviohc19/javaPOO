package SoftwareBox;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private Cliente cliente;
    private List<Produto> produtos;

    public CarrinhoDeCompras(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void excluirUltimoProduto() {
        if (!produtos.isEmpty()) {
            produtos.remove(produtos.size() - 1);
        }
    }

    public void imprimirNotaFiscal() {
        System.out.println("===== Nota Fiscal =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Produtos no carrinho:");

        double valorTotal = 0.0;

        for (Produto produto : produtos) {
            System.out.println(" - " + produto.getNome() + " (Quantidade: " + produto.getQuantidade() + ")");
            double valorProduto = produto.getPreco() * produto.getQuantidade();
            valorTotal += valorProduto;
        }

        System.out.println("Valor Total: R$" + valorTotal);
        System.out.println("=======================");
    }
}
