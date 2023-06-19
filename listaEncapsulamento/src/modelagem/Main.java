package modelagem;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Rua A, 123", "12345678901", 30);

        System.out.println("Informações do cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Idade: " + cliente.getIdade());
    }
}
