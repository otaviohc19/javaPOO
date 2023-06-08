package lista1;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();
		
		System.out.println("Altura do retangulo: ");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = (2*base) + (2*altura);
		double diagonal = Math.sqrt(base*base + altura*altura);
		
		System.out.printf("AREA = %.4f", area);
		System.out.printf("PERIMETRO = %.4f", perimetro);
		System.out.printf("DIAGONAL = %.4f", diagonal);
		
		sc.close();
	}

}
