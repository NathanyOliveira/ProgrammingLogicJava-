import java.util.Scanner;

//Leia um número no console e depois faça o cálculo do quadrado desse número e exiba o resultado no console. 

public class QuadradoDeUmNumero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); 
		
		System.out.println("Digite um número: ");
		Integer numero = scanner.nextInt();
		
		Integer quadradoNumero = numero * numero;
		System.out.println("O quadrado de " + numero + " é " + quadradoNumero);
		
		scanner.close();
		
}
}
