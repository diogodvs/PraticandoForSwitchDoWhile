package praticandoForSwitchDoWhile;

import java.util.Scanner;

public class ProcedenciaDeProduto {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		System.out.println("Insira o preco do Produto: ");
		double preco = dados.nextDouble();

		System.out.println("Insira o codigo do produto: ");
		int idprodu = dados.nextInt();

		String procedencia;

		switch (idprodu) {

		case 1:
			procedencia = "Sul";
			System.out.println("ID Produto: " + idprodu);
			System.out.println("Preco : " + preco);
			System.out.println("Procedencia: " + procedencia);
			break;
		case 2:
			procedencia = "Norte";
			System.out.println("ID Produto: " + idprodu);
			System.out.println("Preco : " + preco);
			System.out.println("Procedencia: " + procedencia);
			break;
		case 3:
			procedencia = "Leste";
			System.out.println("ID Produto: " + idprodu);
			System.out.println("Preco : " + preco);
			System.out.println("Procedencia: " + procedencia);
			break;
		case 4:
			procedencia = "Oeste";
			System.out.println("ID Produto: " + idprodu);
			System.out.println("Preco : " + preco);
			System.out.println("Procedencia: " + procedencia);
			break;
		case 5, 6:
			procedencia = "Nordeste";
			System.out.println("ID Produto: " + idprodu);
			System.out.println("Preco : " + preco);
			System.out.println("Procedencia: " + procedencia);
			break;
		case 7, 8, 9:
			procedencia = "Sudeste";
			System.out.println("ID Produto: " + idprodu);
			System.out.println("Preco : " + preco);
			System.out.println("Procedencia: " + procedencia);
			break;
		case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20:
			procedencia = "Centro-Oeste";
			System.out.println("ID Produto: " + idprodu);
			System.out.println("Preco : " + preco);
			System.out.println("Procedencia: " + procedencia);
			break;
		case 21, 22, 23, 24, 25, 26, 27, 28, 29, 30:
			procedencia = "Noroeste";
			System.out.println("ID Produto: " + idprodu);
			System.out.println("Preco : " + preco);
			System.out.println("Procedencia: " + procedencia);
			break;
		default:
			System.out.println("Procedencia Nao Encontrada!!");
			break;

		}

		dados.close();
	}

}
