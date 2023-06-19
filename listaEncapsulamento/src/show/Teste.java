package show;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do ingresso: ");
        double valorIngresso = sc.nextDouble();

        System.out.print("Digite 1 para ingresso Normal ou 2 para VIP: ");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            Ingresso ingresso = new Normal(valorIngresso);
            ingresso.imprimeValor();
            ((Normal) ingresso).imprimeTipoIngresso();
        } else if (opcao == 2) {
            System.out.print("Digite 1 para Camarote Superior ou 2 para Camarote Inferior: ");
            int opcaoVIP = sc.nextInt();

            if (opcaoVIP == 1) {
                System.out.print("Digite o valor adicional do Camarote Superior: ");
                double valorAdicional = sc.nextDouble();
                VIP ingresso = new CamaroteSuperior(valorIngresso, valorAdicional);
                ingresso.imprimeValor();
            } else if (opcaoVIP == 2) {
                sc.nextLine();
                System.out.print("Digite a localização do Camarote Inferior: ");
                String localizacao = sc.nextLine();
                VIP ingresso = new CamaroteInferior(valorIngresso, 0, localizacao);
                ingresso.imprimeValor();
                ((CamaroteInferior) ingresso).imprimeLocalizacao();
            } else {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}