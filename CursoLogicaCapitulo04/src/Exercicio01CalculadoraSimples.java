 import java.util.Scanner;

public class Exercicio01CalculadoraSimples {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		Double primeiroNumero = scanner.nextDouble();
		
		
		System.out.print("Digite o tipo de opera��o [1= Adi��o | 2= Subtra��o | 3= Multiplica��o | 4= Divis�o: ");
		Integer tipoDeOpera��o = scanner.nextInt();
	
		
		System.out.print("Digite o segundo n�mero: ");
		Double segundoNumero = scanner.nextDouble();
		
		Double resultado = null;
		
		if (tipoDeOpera��o.equals(1)) {
			resultado = primeiroNumero + segundoNumero;
		}
		if (tipoDeOpera��o.equals(2)) {
			resultado = primeiroNumero - segundoNumero;
		}
		if (tipoDeOpera��o.equals(3)) {
			resultado = primeiroNumero * segundoNumero;
		}
		if (tipoDeOpera��o.equals(4)) {
			resultado = primeiroNumero / segundoNumero;
		}
		System.out.println();
		System.out.println("Resultado: " + resultado);
		
		scanner.close();
		
	}

}
