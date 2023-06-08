package javaCondicional;
import java.util.Scanner;

public class baskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("x1 = %.4f%n", x1);
            System.out.printf("x2 = %.4f%n", x2);
        }

        sc.close();
    }
}
