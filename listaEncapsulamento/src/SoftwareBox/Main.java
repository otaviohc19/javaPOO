package SoftwareBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int totalContasCriadas = 0;
        Cliente cliente = null;


        do {
            System.out.println("======= Menu =======");
            System.out.println("1. Cadastro de cliente");
            System.out.println("2. Cadastro de produto");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Adicionar produto no carrinho");
            System.out.println("5. Excluir último produto do carrinho");
            System.out.println("6. Nota Fiscal");
            System.out.println("0. Sair");
            System.out.println("====================");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sc.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = sc.nextLine();
                    System.out.print("Digite o e-mail do cliente: ");
                    String emailCliente = sc.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfCliente = sc.nextLine();
                    System.out.print("Digite o endereço do cliente: ");
                    String enderecoCliente = sc.nextLine();

                    cliente = new Cliente(nomeCliente, emailCliente, cpfCliente, enderecoCliente);
                    totalContasCriadas++;
                    System.out.println("Cliente cadastrado com sucesso!");
                    System.out.println();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = sc.nextDouble();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidadeProduto = sc.nextInt();

                    Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
                    System.out.println("Produto cadastrado com sucesso!");
                    System.out.println();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfBusca = sc.nextLine();

                    if (cliente != null && cliente.getCpf().equals(cpfBusca)) {
                        System.out.println("Cliente encontrado:");
                        System.out.println("Nome: " + cliente.getNome());
                        System.out.println("E-mail: " + cliente.getEmail());
                        System.out.println("CPF: " + cliente.getCpf());
                        System.out.println("Endereço: " + cliente.getEndereco());
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    System.out.println();
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Digite o CPF do cliente: ");
                    String cpfClienteCompra = sc.nextLine();

                    if (cliente != null && cliente.getCpf().equals(cpfClienteCompra)) {
                        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(cliente);

                        System.out.print("Digite o nome do produto a ser adicionado: ");
                        String nomeProdutoCompra = sc.nextLine();
                        System.out.print("Digite o preço do produto: ");
                        double precoProdutoCompra = sc.nextDouble();
                        System.out.print("Digite a quantidade do produto: ");
                        int quantidadeProdutoCompra = sc.nextInt();

                        Produto produtoCompra = new Produto(nomeProdutoCompra, precoProdutoCompra, quantidadeProdutoCompra);
                        carrinho.adicionarProduto(produtoCompra);
                        System.out.println("Produto adicionado ao carrinho com sucesso!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    System.out.println();
                    break;
                case 5:
                    if (cliente != null) {
                        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(cliente);
                        carrinho.excluirUltimoProduto();
                        System.out.println("Último produto do carrinho excluído com sucesso!");
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    System.out.println();
                    break;
                case 6:
                    if (cliente != null) {
                        CarrinhoDeCompras carrinho = new CarrinhoDeCompras(cliente);
                        carrinho.imprimirNotaFiscal();
                    } else {
                        System.out.println("Cliente não encontrado.");
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    System.out.println();
                    break;
            }

        } while (opcao != 0);

        System.out.println("Total de contas de clientes criadas: " + totalContasCriadas);
        sc.close();
    }
}
