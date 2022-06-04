import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Integer primeiraCompra = 0;
		Integer periodoDePromoção = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor da compra: ");
		Double valorCompra = scanner.nextDouble();
		
		System.out.println("Mês da compra- Digite o número do mês: ");
		periodoDePromoção = scanner.nextInt(); 
		
		
		System.out.println("É primeira compra? 1 para sim, 2 para não ");
		primeiraCompra = scanner.nextInt();
		
		Double valorDesconto = valorCompra - (valorCompra * 10 / 100);
		
				if(valorCompra >= 100 && periodoDePromoção == 7 && primeiraCompra == 1) {
			
			System.out.println("Total: " + valorDesconto);}
				else {
					System.out.println("Total: " + valorCompra);
		
		scanner.close();
	}

}}




//public class OperadoresLogicos {
//
//	public static void main(String[] args) {
//		Boolean carrinhoMaiorQue100 = false;
//		Boolean periodoDePromocao = true;
//		Boolean jaFezCompraNaLoja = false;
//		Boolean pagamentoAVista = true;
//		
////		Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
//		
////		Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
//		
////		Boolean aplicarDesconto = periodoDePromocao && carrinhoMaiorQue100 && jaFezCompraNaLoja;
//		
////		Boolean aplicarDesconto = periodoDePromocao || carrinhoMaiorQue100 || jaFezCompraNaLoja;
//		
//		Boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;
//		
//		if (aplicarDesconto) {
//			System.out.println("Sim! Aplique o desconto.");
//		} else {
//			System.out.println("Não aplique o desconto.");
//		}
//		
//		
//	}
//
//}