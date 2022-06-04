//import java.util.Scanner;
//
//public class Exercicio02DescontoDeFrete {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Digite o valor do produto: ");
//		Double valorProduto = scanner.nextDouble();
//		
//		Boolean valorMenorQueCem = valorProduto < 100;
//		final Double VALOR_FRETE = 15.00;
//		
//		if(valorMenorQueCem) {
//			System.out.println("O total da compra é de: " + (valorProduto + VALOR_FRETE));
//		
//	}else
//		System.out.println("O total da compra é de: " + valorProduto);
//		scanner.close();
//}
//	}


import java.util.Scanner;

public class Exercicio02DescontoDeFrete {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Double valorFrete = 15.0;
		
		Boolean freteGratis = valorProduto >= 100;
		
		if(freteGratis) {
			valorFrete = 0.0;
		}
		
		Double valorTotal = valorProduto + valorFrete;
		
		System.out.println("Valor Total " + valorTotal);
		
		scanner.close();
	}
}