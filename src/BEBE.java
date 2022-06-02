import java.util.Scanner;

public class BEBE {
 public static void main(String[] args) {
	 int idade = 0;
	 Scanner batata = new Scanner(System.in);
	 System.out.println("Digite a idade do peao: ");
	 idade = batata.nextInt();
	 
	 if (idade >= 18) {
		 System.out.println("Pode tirar");
	 } else {
		 System.out.println("no puedes.");
	 }
}
}
