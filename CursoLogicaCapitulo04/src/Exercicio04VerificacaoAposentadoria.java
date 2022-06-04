//Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa
//contribuiu com a previd�ncia, depois verifique se ela pode aposentar ou n�o.
//
//Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter 
//contribu�do com, pelo menos, 25 anos. Se ela passar nessas duas condi��es, ent�o mostre
//pra ela uma mensagem dizendo que ela pode aposentar.


import java.util.Scanner;

public class Exercicio04VerificacaoAposentadoria {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		Integer idade55 = scanner.nextInt();
		
		System.out.println("Informe o tempo de contribui��o: ");
		Integer contribuicao25 = scanner.nextInt();
		
		
		Boolean idadeMinimaParaAposentar = idade55 >= 55;
		Boolean tempoMinimoDeContribuicaoParaAposentar =  contribuicao25 >= 25;
		
		
		
		
		if(idadeMinimaParaAposentar && tempoMinimoDeContribuicaoParaAposentar) {
			System.out.println("Voc� pode se aposentar!");
			
		}else {
			System.out.println("Voc� n�o pode se aposentar!");
		}
		
		scanner.close();
	}

}



//import java.util.Scanner;
//
//public class Exercicio04_Aposentadoria {
//
//	public static void main(String[] args) {
//		
//		final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
//		final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Informe sua idade: ");
//		Integer idade = scanner.nextInt();
//		
//		System.out.print("Informe o tempo de contribui��o: ");
//		Integer tempoContribuicao = scanner.nextInt();
//		
//		if (idade >= IDADE_MINIMA_PARA_APOSENTAR && tempoContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO) {
//			System.out.print("Parab�ns! Voc� j� pode se aposentar");
//		}else {
//			System.out.println("Voc� ainda n�o est� apto � se aposentar!");
//		}
//	scanner.close();
//	}
//
//}
