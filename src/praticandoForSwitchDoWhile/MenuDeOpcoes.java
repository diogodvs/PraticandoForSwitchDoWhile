package praticandoForSwitchDoWhile;

import java.util.Scanner;

public class MenuDeOpcoes {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		double salario, imposto = 0;

		System.out.println(" -----        Menu        -----");
		System.out.println("Escolha uma opção pelo numero: ");
		System.out.println("           1 - Imposto         ");
		System.out.println("        2 - Novo Salario       ");
		System.out.println("        3 - Classificação      ");
		System.out.println("            4 - Sair           ");

		int escolha = dados.nextInt();

		switch (escolha) {

		case 1:

			System.out.println("Insira o seu salario: ");
			salario = dados.nextDouble();

			if (salario < 500.00) {
				imposto = salario * 0.05;
			} else if (salario >= 500.00 && salario < 850.00) {
				imposto = salario * 0.10;
			} else if (salario > 850.00) {
				imposto = salario * 0.15;
			}

			System.out.println("Imposto: " + imposto);

			break;

		case 2:

			System.out.println("Insira o seu salario: ");
			salario = dados.nextDouble();

			if (salario < 450.00) {
				salario = salario + 100.00;
			} else if (salario >= 450.00 && salario < 750.00) {
				salario = salario + 75.00;
			} else if (salario >= 750.00 && salario <= 1500.00) {
				salario = salario + 50.00;
			} else {
				salario = salario + 250.00;
			}

			System.out.println("Novo Salario: " + salario);

			break;

		case 3:

			System.out.println("Insira o seu salario: ");
			salario = dados.nextDouble();

			if (salario <= 700.00) {
				System.out.println("Mal Remunerado !!");
			} else {
				System.out.println("Bem Remunerado !!");
			}

			break;

		default:
			System.out.println("Obrigado por usar nosso programa !!");
			break;
		}

		dados.close();
	}

}
