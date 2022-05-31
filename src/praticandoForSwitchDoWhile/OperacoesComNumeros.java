package praticandoForSwitchDoWhile;

import java.util.Scanner;

public class OperacoesComNumeros {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		double valor;

		System.out.println("Escolha um numero de 1 a 4: ");
		int indice = dados.nextInt();

		System.out.println("Insira o primeiro valor: ");
		int num = dados.nextInt();

		System.out.println("Insira o primeiro valor: ");
		int num2 = dados.nextInt();

		switch (indice) {
		case 1:
			valor = (num + num2) / 2;
			System.out.println("Media dos Valores digitados é: " + valor);
			break;

		case 2:
			valor = num;
			if (valor < num2) {
				valor = num2;
				System.out.println("Maior valor digitado é: " + valor);
			} else {
				System.out.println("Maior valor digitado é: " + valor);
			}
			break;
			
		case 3: 
			valor = num * num2;
			System.out.println("Produto dos valores digitados é: " + valor);
			break;
		
		case 4: 
			valor = num / num2;
			System.out.println("Divisão dos valores digitados é: " + valor);
			break;
		
		default :
			System.out.println("Opcao escolhida nao existe!!");
		}	

		dados.close();
	}

}
