import java.util.Scanner;

public class TirarCarteiraTeste {
	
	final static Integer IDADE_MINIMA = 21; 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Pode!");
			
		}else {
			System.out.println("Não! Cresça!");
			
		}
			scanner.close();
	}
	
}
