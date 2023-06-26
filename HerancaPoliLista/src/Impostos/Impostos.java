package Impostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Impostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Entre com o número de contribuintes: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nContribuinte #" + i + " data:");
            System.out.print("Individual ou empresa (i/c)? ");
            char tipo = scanner.next().charAt(0);
            scanner.nextLine(); // Limpar o buffer

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Renda anual: ");
            double rendaAnual = scanner.nextDouble();

            if (tipo == 'i') {
                System.out.print("Despesas com saúde: ");
                double gastosSaude = scanner.nextDouble();
                contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else if (tipo == 'c') {
                System.out.print("Número de empregados: ");
                int numeroFuncionarios = scanner.nextInt();
                contribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            } else {
                System.out.println("Opção inválida! Contribuinte descartado.");
            }
        }

        System.out.println("\nIMPOSTOS PAGOS:");
        double impostosTotais = 0.0;

        for (Contribuinte contribuinte : contribuintes) {
            double imposto = contribuinte.calcularImposto();
            impostosTotais += imposto;
            System.out.println(contribuinte.getNome() + ": R$ " + imposto);
        }

        System.out.println("IMPOSTOS TOTAIS: R$ " + impostosTotais);
    }
}
