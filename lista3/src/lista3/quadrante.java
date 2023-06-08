package lista3;

import java.util.Scanner;	

public class quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite os valores das coordenadas X e Y:");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 0 || y == 0) {
                break;
            } else {
                String quadrante;

                if (x > 0 && y > 0) {
                    quadrante = "Q1";
                } else if (x < 0 && y > 0) {
                    quadrante = "Q2";
                } else if (x < 0 && y < 0) {
                    quadrante = "Q3";
                } else {
                    quadrante = "Q4";
                }

                System.out.println("QUADRANTE " + quadrante);
            }
        }

        sc.close();
    }
}
