package Ecommerce;

public class Main {
    public static void main(String[] args) {
        // Creating a cliente
        ClienteEcommerce cliente = new ClienteEcommerce("João", "joao@email.com",
            "12345678901", "Rua A, 123 - Bairro X - Cidade Y - Estado Z - CEP 12345-678");

        // Creating a product
        Produto produto = new Produto("Camiseta", "Camiseta preta de algodão",
            29.99, "Roupa");

        // Displaying cliente information
        System.out.println("Cliente information:");
        System.out.println("Name: " + cliente.getNome());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Address: " + cliente.getEndereco());

        // Displaying product information
        System.out.println("\nProduct information:");
        System.out.println("Name: " + produto.getNome());
        System.out.println("Description: " + produto.getDescricao());
        System.out.println("Price: R$" + produto.getPreco());
        System.out.println("Category: " + produto.getCategoria());
    }
}
