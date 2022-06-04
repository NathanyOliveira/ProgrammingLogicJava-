import java.util.Scanner;

//Faça um programa que receba:
//
//O valor da conta de luz
//Conta de água
//Conta de telefone
//Escola do filho
//Fatura do cartão
//Gastos com supermercado
//... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".

//public class Exercicio03CalculoGastosFamiliar {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		Double soma = 0.0;
//		System.out.println("Conta de luz: ");
//		Double contaLuz = scanner.nextDouble();
//		Double soma = 0.0;
//		soma += scanner.nextDouble();
//		System.out.println("Conta água: ");
//		Double contaAgua = scanner.nextDouble();
//		
//		Double total = contaAgua + contaLuz;
//		
//		
//		soma += total;
//		
//		
//		System.out.println("Total: " + soma); 
//		
//		
//		
//
//		
//		scanner.close();
//	}
//}
//
//
//package teste;
//
//import java.math.BigDecimal;
//import java.util.Scanner;



	import java.util.Scanner;

	public class Exercicio03CalculoGastosFamiliar {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			Double valorTotalContas = 0.0;
			
			System.out.print("Digite o valor da conta de luz: ");
			Double valorLuz = scanner.nextDouble();
			
			valorTotalContas += valorLuz;
			
			System.out.print("\nDigite o valor da conta de água: ");
			Double valorAgua = scanner.nextDouble();
			
			valorTotalContas += valorAgua;
			
			System.out.print("\nDigite o valor da conta de telefone: ");
			Double valorTelefone = scanner.nextDouble();
			
			valorTotalContas += valorTelefone;
			
			System.out.print("\nDigite o valor da mensalidade escolar: ");
			Double valorMensalidadeEscolar = scanner.nextDouble();
			
			valorTotalContas += valorMensalidadeEscolar;
			
			System.out.print("\nDigite o valor da fatura do cartão: ");
			Double valorFaturaCartao = scanner.nextDouble();
			
			valorTotalContas += valorFaturaCartao;
			
			System.out.print("\nDigite o valor da conta do supermercado: ");
			Double valorContaSupermercado = scanner.nextDouble();
			
			valorTotalContas += valorContaSupermercado;
			
			//valorTotalContas += valorLuz + valorAgua + valorTelefone + valorMensalidadeEscolar + valorFaturaCartao + valorContaSupermercado;
			
			System.out.printf("\nValor total das despesas: %.2f R$", valorTotalContas);
					
			scanner.close();
		}
	}