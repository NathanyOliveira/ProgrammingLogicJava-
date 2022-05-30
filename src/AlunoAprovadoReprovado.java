import java.util.Scanner;

public class AlunoAprovadoReprovado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Digite sua nota: ");
		Integer nota = scanner.nextInt();
				
		Boolean alunoAprovado = nota >= 7 ; 
		
		if(alunoAprovado) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		scanner.close();
	}
}
