package praticandoForSwitchDoWhile;

import java.util.Scanner;

public class tabuadaMultiplicacao {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Insira o numero para calcular a tabuada: ");
		int x = dados.nextInt();
	
		for (int i = 0; i <= 10 ; i++) {
			int res = ( x * i );
			
		System.out.println(x + " * " + i + " = " + res);	
		}
	
	dados.close();}

}
