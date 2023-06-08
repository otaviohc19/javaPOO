package lista3;

import java.util.Scanner;

public class validacao_de_nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double primeiraNota;
        double segundaNota;

        do {
            System.out.println("Digite a primeira nota:");
            primeiraNota = sc.nextDouble();

            if (primeiraNota < 0 || primeiraNota > 10) {
                System.out.println("Valor inválido! Tente novamente:");
            }
        } while (primeiraNota < 0 || primeiraNota > 10);

        do {
            System.out.println("Digite a segunda nota:");
            segundaNota = sc.nextDouble();

            if (segundaNota < 0 || segundaNota > 10) {
                System.out.println("Valor inválido! Tente novamente:");
            }
        } while (segundaNota < 0 || segundaNota > 10);

        double media = (primeiraNota + segundaNota) / 2;
        System.out.println("MÉDIA = " + media);

        sc.close();
    }
}
