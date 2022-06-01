import java.util.Scanner;

public class Constantes{
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA;
		
		if(podeTirarCarteira) {
			System.out.println("Sim! Autorizado!");
			
		}else {
			System.out.println("Não! Idade abaixo da lei!");
		}
		scanner.close();
}	
}