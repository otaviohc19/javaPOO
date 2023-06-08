package lista1;
import java.util.Scanner;
import java.lang.Math;
import java.util.Locale;

public class circulo {
  public static void main(String[] args) {
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor do raio do círculo: ");
    double raio = sc.nextDouble();

    double area = Math.PI * Math.pow(raio, 2);

    System.out.printf("A área do círculo é %.3f.\n", area);
    sc.close();
  }
}
