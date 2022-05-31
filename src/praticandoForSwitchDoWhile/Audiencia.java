package praticandoForSwitchDoWhile;

import java.util.Scanner;

public class Audiencia {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		String canais[] = new String[8];
		canais[0] = "C4";
		canais[2] = "C5";
		canais[4] = "C7";
		canais[6] = "C12";

		int media, divisor = 4, somatorio = 0;
		int cont = 0;
	
		
		do {

			System.out.printf("Insira a audiência do canal %s: \n", canais[cont]);
			canais[cont + 1] = dados.next();

			somatorio = somatorio + Integer.parseInt(canais[cont+1]);
			
			if (canais[cont] == "0") {
				divisor--;
			}
			System.out.println(somatorio);
			cont = cont + 2;

		} while (cont < 8);

		

		double audC4 = (Integer.parseInt(canais[1]) * 100) / somatorio;
		double audC5 = (Integer.parseInt(canais[3]) * 100) / somatorio;
		double audC7 = (Integer.parseInt(canais[5]) * 100) / somatorio;
		double audC12 = (Integer.parseInt(canais[7]) * 100) / somatorio;
		
		System.out.println();
		System.out.println("Audiencia do canal 4: " + audC4 + "%");
		System.out.println("Audiencia do canal 5: " + audC5 + "%");
		System.out.println("Audiencia do canal 7: " + audC7 + "%");
		System.out.println("Audiencia do canal 12: " + audC12 + "%");
		
		System.out.println();
		System.out.println("Digite 0 para Sair.");
		int sair = dados.nextInt();

		if (sair == 0) {
			System.out.println("Obrigado por usar nosso Programa!!");
		}

	}

}
