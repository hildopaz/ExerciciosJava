import java.util.Arrays;
import java.util.Scanner;

/*Faça um programa com um array de 8 posições que receba 8 valores reais do usuário.
Em seguida o usuário fornece duas posições X e Y doarray. Exiba na tela o conteúdo 
do array e a soma dos valores destas duas posições.*/
public class Exercicio04Hildo {

	public static void main(String[] args) {
	
		double array[] = new double [8];
		
		System.out.print("Digite 8 valores: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < array.length; i++) {
			array[i] = s.nextDouble();
		}
		
		System.out.println("Digite as posiçoes que quer comparar: ");
		int posic1 = 0;
		int posic2 = 0;
		
		 posic1 = s.nextInt();
		 posic2 = s.nextInt();
		 
		 
		 double soma = array[posic1] + array[posic2];
		System.out.println("Valores Digitados: " +Arrays.toString(array));
		 System.out.println("A soma das duas posiçoes é: " +soma);
	s.close();	
	}

}
