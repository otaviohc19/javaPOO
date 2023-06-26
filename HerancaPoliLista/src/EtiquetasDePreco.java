import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import produtos.Produto;
import produtos.ProdutoComum;
import produtos.ProdutoImportado;
import produtos.ProdutoUsado;

public class EtiquetasDePreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Entre com o número de produtos: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nProduto #" + i + " data:");
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char tipo = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Preço: ");
            double preco = scanner.nextDouble();

            switch (tipo) {
                case 'c':
                    produtos.add(new ProdutoComum(nome, preco));
                    break;
                case 'u':
                    System.out.print("Data de fabricação (DD/MM/YYYY): ");
                    String dataFabricacao = scanner.next();
                    produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
                    break;
                case 'i':
                    System.out.print("Taxa de importação: ");
                    double taxaImportacao = scanner.nextDouble();
                    produtos.add(new ProdutoImportado(nome, preco, taxaImportacao));
                    break;
                default:
                    System.out.println("Opção inválida! Produto descartado.");
                    break;
            }
        }

        System.out.println("\nETIQUETAS DE PREÇO:");

        for (Produto produto : produtos) {
            System.out.println(produto.getPrecoTag());
        }
    }
}
