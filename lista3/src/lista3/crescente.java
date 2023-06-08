package lista3;

import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite dois números:");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x < y) {
                System.out.println("CRESCENTE!");
            } else if (x > y) {
                System.out.println("DECRESCENTE!");
            } else {
                System.out.println("Os valores são iguais. Encerrando o programa.");
                break;
            }
        }

        sc.close();
    }
}
