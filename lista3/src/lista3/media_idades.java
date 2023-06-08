package lista3;

import java.util.Scanner;

public class media_idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaIdades = 0;
        int contador = 0;

        System.out.println("Digite as idades:");

        while (true) {
            int idade = sc.nextInt();

            if (idade < 0) {
                if (contador == 0) {
                    System.out.println("IMPOSSÍVEL CALCULAR");
                } else {
                    double media = (double) somaIdades / contador;
                    System.out.println("Média das idades: " + media);
                }
                break;
            }

            somaIdades += idade;
            contador++;
        }

        sc.close();
    }
}
