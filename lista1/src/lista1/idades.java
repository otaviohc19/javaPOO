package lista1;
import java.util.Scanner;

public class idades {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Digite o nome da primeira pessoa: ");
    String nome1 = sc.nextLine();

    System.out.print("Digite a idade da primeira pessoa: ");
    int idade1 = sc.nextInt();

    sc.nextLine();
   
    System.out.print("Digite o nome da segunda pessoa: ");
    String nome2 = sc.nextLine();

    System.out.print("Digite a idade da segunda pessoa: ");
    int idade2 = sc.nextInt();
    
    double idadeMedia = (idade1 + idade2) / 2.0;

    System.out.printf("A idade média entre %s e %s é de %.1f anos.\n", nome1, nome2, idadeMedia);
    sc.close();
  }
}
