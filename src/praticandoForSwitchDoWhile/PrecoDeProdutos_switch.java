package praticandoForSwitchDoWhile;

//Faça um programa que receba o preço, a categoria (1 – limpeza; 2 – alimentação; ou 3 – vestuário) 
//e o tipo de conservacao (R – produtos que necessitam de refrigeração; e N – produtos que não necessitam de refrigeração)
//. Calcule e mostre:

import java.util.Scanner;

public class PrecoDeProdutos_switch {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		
		double newprice = 0;
		double preco;
		String nomeProduto;
		int categoria;
		char conservacao;

		System.out.print("Insira o nome do produto: \n");
		nomeProduto = dados.next();

		System.out.print("Insira o preço do produto: \n");
		preco = dados.nextDouble();

		System.out.println("Insira a categoria do Produto sendo [ 1- Limpeza / 2- Alimentacao / 3- vestuario:");
		categoria = dados.nextInt();

		System.out.println("Insira o tipo de conservação necessaria sendo [ R - Refrigerado / N - Não Refrigerado: ");
		conservacao = dados.next().charAt(0);

		System.out.println("Nome do Produto: " + nomeProduto);
		aumentarPreco( preco, categoria, newprice);
		calcularImposto(categoria, conservacao, preco, newprice);
		imprimirClassificacao(newprice);

		dados.close();
	}

	public static void aumentarPreco(double preco, int categoria, double newprice) {

		double aumento = 0;
		
		if (preco <= 25.00) {

			switch (categoria) {
			case 1:
				aumento = preco * 0.05;
				newprice = preco * 1.05;
				break;
			case 2:
				aumento = preco * 0.08;
				newprice = preco * 1.08;
				break;
			case 3:
				aumento = preco * 0.10;
				newprice = preco * 1.10;
				break;
			}

		} else if (preco > 25.00) {

			switch (categoria) {
			case 1:
				aumento = preco * 0.12;
				newprice = preco * 1.12;
				break;
			case 2:
				aumento = preco * 0.15;
				newprice = preco * 1.15;
				break;
			case 3:
				aumento = preco * 0.18;
				newprice = preco * 1.18;
				break;
			}
		}
		System.out.println("Valor do aumento: " + aumento);
	}

	public static void calcularImposto(int categoria, char conservacao, double preco, double newprice) {

		double imposto;

		if ((categoria != 2) || (conservacao != 'R')) {
			newprice = preco * 0.92;
			imposto = preco * 0.08;
		} else {
			newprice = preco * 0.95;
			imposto = preco * 0.05;
		}
		System.out.println("Imposto: " + imposto);
		System.out.println("Novo preco: " + newprice);
	}

	public static void imprimirClassificacao(double newprice) {
		if (newprice <= 50.00) {
			System.out.println("Barato");
		} else if (newprice > 50.00 && newprice < 120.00) {
			System.out.println("Normal");
		} else {
			System.out.println("Caro");
		}
	}
}
