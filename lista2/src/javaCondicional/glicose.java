package javaCondicional;
import java.util.Scanner;

public class glicose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de glicose no sangue (mg/dl): ");
        double glicose = sc.nextDouble();

        String classificacao;

        if (glicose <= 100.0) {
            classificacao = "Normal";
        } else if (glicose <= 140.0) {
            classificacao = "Elevado";
        } else {
            classificacao = "Diabetes";
        }

        System.out.printf("A quantidade de glicose de %.2f mg/dl é classificada como %s.%n", glicose, classificacao);

        sc.close();
    }
}
