package compradeprodutos;

import java.util.Scanner;

public class OperacoesNota {

	public static double precoTotal;
	public static double precoUnit;
	public static double desconto;
	public static double precoTotalcomDesconto;

	public static int idprod;
	public static int quantProdutos;

	public OperacoesNota() {
		super();
	}

	public static double atribuirPrecoUnitario(Scanner dados) {
		int caso = 0;

		System.out.println("Insira o codigo do produto: ");
		idprod = dados.nextInt();

		if (idprod <= 10) {
			caso = 1;
		} else if (idprod > 10 || idprod <= 20) {
			caso = 2;
		} else if (idprod > 20 || idprod <= 30) {
			caso = 3; 
		} else {
			caso = 4;
		}
		
		switch(caso) {
		case 1: precoUnit = 10.00;
		case 2: precoUnit = 15.00;
		case 3: precoUnit = 20.00;
		case 4: precoUnit = 30.00;
		}

		return precoUnit;
	}

	public static double calcularPrecoTotal(Scanner dados) {

		System.out.println("Insira a quantidade comprada: ");
		quantProdutos = dados.nextInt();

		precoTotal = precoUnit * quantProdutos;

		return precoTotal;
	}

	public static double calcularDesconto() {

		if (precoTotal <= 250.00) {
			desconto = precoTotal * 0.05;

		} else if (precoTotal > 250.00 && precoTotal <= 500.00) {
			desconto = precoTotal * 0.10;

		} else {
			desconto = precoTotal * 0.15;

		}
		precoTotalcomDesconto = precoTotal - desconto;

		return desconto;
	}

	public static void imprimirNota() {

		System.out.println("------ Nota Fiscal ------");
		System.out.printf(" Total unit.:   %.2f \n", precoUnit);
		System.out.printf(" Total :        %.2f \n", precoTotal);
		System.out.printf(" Desconto :     %.2f \n", desconto);
		System.out.printf(" Total c/Desc.: %.2f \n", precoTotalcomDesconto);

	}

}
