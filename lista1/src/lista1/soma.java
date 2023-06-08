package lista1;
import java.util.Scanner;

public class soma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor de X: ");
    int x = sc.nextInt();

    System.out.print("Digite o valor de Y: ");
    int y = sc.nextInt();

    int soma = x + y;

    System.out.printf("A soma de %d e %d é %d.\n", x, y, soma);
    sc.close();
  }
}
