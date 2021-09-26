import java.util.Scanner;

/*Faça um programa com um array de 10 posições e que receba do usuário os valores para preenchê-lo.
Em seguida exiba na tela o maior e o menor valor do array.*/
public class Exercicio05Hildo {

	public static void main(String[] args) {
		System.out.print("Digite 10 valores: ");
		double array[] = new double[10];
		Scanner s = new Scanner(System.in);

		
		for (int i = 0; i < array.length; i++) {
			array[i] = s.nextDouble();
		}
		double maiorValor = 0;
		double menorValor = array[0];
		
		for (int i = 0; i < array.length; i++){
			if (array[i] > maiorValor)
				{maiorValor = array[i];}
			 if (array[i] < menorValor) {
				menorValor = array[i];
			}
		}
			
		
		System.out.println("O maior valor digitado foi: " +maiorValor + " E o menor valor digitado foi: " + menorValor);
		
		s.close();
	}

	}
