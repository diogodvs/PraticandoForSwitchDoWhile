package praticandoForSwitchDoWhile;

public class aumentoSalarial {

	public static void main(String[] args) {
		
		double salario = 1000.00;
		
		double porcentagem = 0.015;
		
		for (int i = 2001; i < 2018; i++) {
			
			double aumento = salario * porcentagem;
			
			porcentagem = porcentagem * 2;

			salario = salario + aumento;
			
			System.out.printf("O salario do ano " + i + " é de R$ %.2f \n", salario);
		}
	}

}
