
public class Vetores {

	public static void main(String[] args) {
		// *** Cria��o de um vetor/Array
		double notas[] = {7.8, 8.4, 6.5, 9.2};
		String alunos[] = {
				"Maria", 
				"Jos�", 
				"Jo�o",
				"Fernanda",
				"Fabiana",
				"Wiliam"
		};
		
		//Calcular a M�DIA
		
		
		//LOOPING for/while/do-until
		double soma = 0;
		for(int i = 0; i < 4; i++) {
			soma += notas[i];
		}
		
		double media = soma/4;
		System.out.println("M�dia: " + media);
		
		/*System.out.println("Notas: " + notas[2]);
		System.out.println("Alunos: " + alunos.length);
		notas[3] = 9.8;
		System.out.println(notas[3]);*/
		
	}

}