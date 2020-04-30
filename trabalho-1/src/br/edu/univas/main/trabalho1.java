package br.edu.univas.main;
import java.util.Scanner;
public class trabalho1 {
	
	public static void main(String[] args) {
			
		for(int i = 0;;i++) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println();
			System.out.println("Menu: ");
			System.out.println();
			System.out.println("1. Somar ");
			System.out.println("2. Subtrair ");
			System.out.println("3. Multiplicar ");
			System.out.println("4. Dividir ");
			System.out.println("9. Sair ");
			System.out.println();
			System.out.println("Insira a operação abaixo: ");
			int escolha = scanner.nextInt();
			
			if(escolha == 1) {
				System.out.println();
				System.out.println("• Digite o primeiro número: ");
				float X1 = scanner.nextInt();
				System.out.println();
				System.out.println("• Digite o segundo número: ");
				float Y1 = scanner.nextInt();
				System.out.println();
				
				float soma = X1 + Y1;
				
				System.out.println("A soma de " + X1 + " por " + Y1 + " é igual a: " + soma);
				System.out.println();
				System.out.println("----------------------------------------------------------");
				System.out.println();
				continue;
			} else if (escolha == 2) {
				System.out.println("• Digite o primeiro número: ");
				float X2 = scanner.nextInt();
				System.out.println("• Digite o segundo número: ");
				float Y2 = scanner.nextInt();
				
				float subtracao = X2 - Y2;
				
				System.out.println("A subtração de " + X2 + " por " + Y2 + " é igual a: " + subtracao);
				System.out.println();
				System.out.println("----------------------------------------------------------");
				System.out.println();
				continue;
			} else if (escolha == 3) {
				System.out.println("• Digite o primeiro número: ");
				float X3 = scanner.nextInt();
				System.out.println("• Digite o segundo número: ");
				float Y3 = scanner.nextInt();
				
				float multiplo = X3 * Y3;
				
				System.out.println("A multiplicação de " + X3 + " por " + Y3 + " é igual a: " + multiplo);
				System.out.println();
				System.out.println("----------------------------------------------------------");
				System.out.println();
				continue;
			} else if (escolha == 4) {
				System.out.println("• Digite o primeiro número: ");
				float X4 = scanner.nextInt();
				System.out.println("• Digite o segundo número: ");
				float Y4 = scanner.nextInt();
				
				float divisao = X4/Y4;
				
				System.out.println("A divisão de " + X4 + " por " + Y4 + " é igual a: " + divisao);
				System.out.println();
				System.out.println("----------------------------------------------------------");
				System.out.println();
				continue;
			} else if (escolha == 9) {
				System.out.println();
				System.out.println("Programa encerrado! Obrigado por usar-me!");
				break;
			} else
				System.out.println("Opção inválida! Por favor, digite uma opção correta!");
				System.out.println();
				System.out.println("----------------------------------------------------------");
				System.out.println();
				continue;
		}
	}
}
