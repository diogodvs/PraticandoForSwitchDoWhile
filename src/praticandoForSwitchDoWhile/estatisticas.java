package praticandoForSwitchDoWhile;

public class estatisticas {

	public static void main(String[] args) {

		String cidades[] = { "city1", "city2", "city3", "city4", "city5" };
		int acidentes[] = { 956, 590, 469, 265, 146 };
		int quantveicu[] = { 5438, 4978, 2498, 1943, 1432 };
		int idcity[] = { 001, 002, 003, 004, 005 };

		int maior = 0;
		int menor = 100000000;
		String indmaior = "";
		String indmenor = "";

		int count = 0;
		int media2 = 0;

		for (int j = 0; j < idcity.length; j++) {
			if (acidentes[j] > maior) {
				maior = acidentes[j];
				indmaior = cidades[j];
			}

		}
		System.out.println("O maior indice de acidentes é na " + indmaior + " num total de " + maior + " acidentes.");

		for (int t = 0; t < idcity.length; t++) {
			if (acidentes[t] < menor) {
				menor = acidentes[t];
				indmenor = cidades[t];
			}

		}

		System.out.println("O menor indice de acidentes é na " + indmenor + " num total de " + menor + " acidentes.");

		int soma = 0;

		for (int i = 0; i < cidades.length; i++) {
			soma = soma + quantveicu[i];

		}
		int media = soma / cidades.length;
		System.out.println("A media de carros destas 5 cidades são de: " + media);

		int somaaciden = 0;
		
		for (int i = 0; i < idcity.length; i++) {
			if (quantveicu[i] < 2000) {
				
				somaaciden = somaaciden + acidentes[i];
				count = count + 1;
				
				System.out.println(somaaciden);
			}

		}
		media2 = somaaciden / count;
		System.out.println("A media de acidentes nas cidades com menos de 2000 carros de passeio é de: " + media2);
	}

}
