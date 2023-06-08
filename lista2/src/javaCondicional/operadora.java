package javaCondicional;
import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos consumidos: ");
        int minutosConsumidos = sc.nextInt();

        double valorConta;

        if (minutosConsumidos <= 100) {
            valorConta = 50.0;
        } else {
            valorConta = 50.0 + (minutosConsumidos - 100) * 2.0;
        }

        System.out.printf("O valor a ser pago é R$ %.2f%n", valorConta);

        sc.close();
    }
}
