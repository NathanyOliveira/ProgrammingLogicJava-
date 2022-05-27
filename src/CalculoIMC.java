import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o valor da altura: ");
		Double valorAltura = scanner.nextDouble();
		
		
		System.out.println("Digite o valor do peso: ");
		Double valorPeso  = scanner.nextDouble();
		
		Double AlturaCalculada = valorAltura * valorAltura;
		
		Double IMC = valorPeso / AlturaCalculada;
		
		System.out.println("O IMC é: " + IMC);
		
		scanner.close();
		
		
	}
	
	
	
}
