package javaCondicional;
import java.util.Scanner;

public class notas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a nota do primeiro semestre: ");
    double nota1 = sc.nextDouble();

    System.out.print("Digite a nota do segundo semestre: ");
    double nota2 = sc.nextDouble();

    double notaFinal = (nota1 + nota2) / 2;

    System.out.printf("Nota final: %.1f\n", notaFinal);

    if (notaFinal < 60.0) {
      System.out.println("REPROVADO");
    }
    sc.close();
  }
}
