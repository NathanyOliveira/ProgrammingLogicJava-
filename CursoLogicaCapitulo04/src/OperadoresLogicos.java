import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		Boolean carrinhoMaiorQue100 = true;
		Integer primeiraCompra = 0;
		Integer periodoDePromo��o = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Valor da compra: ");
		Double valorCompra = scanner.nextDouble();
		
		System.out.println("M�s da compra- Digite o n�mero do m�s: ");
		periodoDePromo��o = scanner.nextInt(); 
		
		
		System.out.println("� primeira compra? 1 para sim, 2 para n�o ");
		primeiraCompra = scanner.nextInt();
		
		Double valorDesconto = valorCompra - (valorCompra * 10 / 100);
		
				if(valorCompra >= 100 && periodoDePromo��o == 7 && primeiraCompra == 1) {
			
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
//			System.out.println("N�o aplique o desconto.");
//		}
//		
//		
//	}
//
//}