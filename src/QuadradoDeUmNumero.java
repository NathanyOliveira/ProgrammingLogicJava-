import java.util.Scanner;

//Leia um n�mero no console e depois fa�a o c�lculo do quadrado desse n�mero e exiba o resultado no console. 

public class QuadradoDeUmNumero {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); 
		
		System.out.println("Digite um n�mero: ");
		Integer numero = scanner.nextInt();
		
		Integer quadradoNumero = numero * numero;
		System.out.println("O quadrado de " + numero + " � " + quadradoNumero);
		
		scanner.close();
		
}
}
