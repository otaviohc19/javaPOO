package lista1;

import java.util.Locale;
import java.util.Scanner;

public class terreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado: ");
		double valorM = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * valorM;
		
		System.out.printf("Area do terreno = %.2f", area);
		System.out.printf("\nPreco do terreno = %.2f", preco);
		
		sc.close();

	}

}
