import java.util.Arrays;
import java.util.Scanner;

/*Faça uma programa com um array que recebe do usuário 10 números reais. 
Calcule o quadrado de cada elemento deste array e armazene estes valores 
calculados em outro array. Exiba na tela os valores dos dois arrays*/

public class Exercicio03Hildo {

	public static void main(String[] args) {
		double array[] = new double [10];
	
		System.out.print("Digite 10 valores: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			array[i] = s.nextDouble();
		}
		
		double soma[] = new double[10];
		for(int i = 0; i < array.length; i++) {
			soma[i] = Math.pow(array[i], 2);
			
	}
		System.out.println(Arrays.toString(array));
		System.out.println("Os valores ao quadrado é: " +Arrays.toString(soma));
		s.close();
	}

}
