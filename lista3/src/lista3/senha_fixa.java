package lista3;

import java.util.Scanner;

public class senha_fixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaCorreta = 2002;

        while (true) {
            System.out.println("Digite a senha:");
            int senhaInserida = sc.nextInt();

            if (senhaInserida == senhaCorreta) {
                System.out.println("Acesso permitido!");
                break;
            } else {
                System.out.println("Senha inválida! Tente novamente:");
            }
        }

        sc.close();
    }
}
