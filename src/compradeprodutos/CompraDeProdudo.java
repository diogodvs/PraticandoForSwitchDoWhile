package compradeprodutos;

import java.util.Scanner;

public class CompraDeProdudo {

	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		OperacoesNota.atribuirPrecoUnitario(dados);

		OperacoesNota.calcularPrecoTotal(dados);

		OperacoesNota.calcularDesconto();

		OperacoesNota.imprimirNota();

		dados.close();
	}

}
