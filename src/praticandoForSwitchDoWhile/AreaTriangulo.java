package praticandoForSwitchDoWhile;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		double base, altura, area;

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira o valor da base: ");

		do {

			base = dados.nextDouble();

			if (base <= 0) {
				System.out.println("O valor nao pode ser menor ou igual a 0!!");
				System.out.println("Insira novamente o valor: ");
			}

		} while (base <= 0);
		
		System.out.println("Insira o valor da altura: ");
		
		do {

			altura = dados.nextDouble();

			if (base <= 0) {
				System.out.println("O valor nao pode ser menor ou igual a 0!!");
				System.out.println("Insira novamente o valor: ");
			}

		} while (altura <= 0);
		
		area = (base * altura) / 2;

		System.out.println("Area do Triangulo: " + area);

		

		dados.close();
	}

}
