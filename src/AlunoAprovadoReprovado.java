import java.util.Scanner;

public class AlunoAprovadoReprovado {
	
	static final Integer MEDIA_MINIMA_PARA_PASSAR = 7;
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.print("Digite sua nota: ");
		Integer nota = scanner.nextInt();
				
		Boolean alunoAprovado = nota >= MEDIA_MINIMA_PARA_PASSAR; 
		
		if(alunoAprovado) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		
		scanner.close();
	}
}
