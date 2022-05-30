import java.util.Scanner;

public class Exercicio02cap3 {
	
	
public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Digite o primeiro nome: ");
	String nome = scanner.nextLine();
	
	System.out.println("Digite o sobrenome: ");
	String sobrenome = scanner.nextLine();
	
	String nomeCompleto = nome +" " + sobrenome;
	
	System.out.println("Olá: " + nomeCompleto);
	
	
}
}
