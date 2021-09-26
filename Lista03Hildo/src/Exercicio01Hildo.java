import java.util.Scanner;

//Criar um programa que receba uma palavra e imprime no console letra por letra

public class Exercicio01Hildo {

	public static void main(String[] args) {
		
		System.out.print("Digite uma palavra: ");
		Scanner s = new Scanner(System.in);
		
		String palavra = s.next();
		
		for (int i = 0; i < palavra.length(); i++) {
			
		System.out.println(palavra.charAt(i));}
		
		s.close();
	}

}
