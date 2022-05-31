package praticandoForSwitchDoWhile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaIdades {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);
		
		int verificador;
		int media, somatorio = 0;
		int cont = 0;
		
		List<Integer> idades = new ArrayList<>();
		
		do {

			System.out.printf("Insira a %dº idade: \n", cont + 1);
			idades.add(dados.nextInt());

			verificador = idades.get(cont);
			
			somatorio = somatorio + idades.get(cont);
			cont++;
			

		} while (verificador != 0);

		media = somatorio / (idades.size() - 1 );

		System.out.printf("Media de Idades inseridas: %d", media);

		dados.close();
	}

}
