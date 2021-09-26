import java.util.Scanner;

/*Faça um programa que contenha um array chamado A e que receba do usuário 6 valores inteiros. 
O programa deve executar os seguintes passos:
◦Atribuir os seguintes valores ao array: 1, 0, 5, -2, -5, 7.◦Armazene em uma variável 
do tipo inteira a soma dos valores das seguintes posições do array: A[0], A[1] e A[5] 
mostre o valor desta soma na tela.◦Mostre na tela cada elemento do array sendo 
um valor em cada linha.▪Use somente uma instrução System.out.println para realizar este */


public class Exercicio02Hildo {

	public static void main(String[] args) {
		int a[] = new int [6];
		System.out.print("Digite 6 valores: ");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			
		}
		int soma = 0;
		for(int i = 0; i < a.length; i++) {
				soma = a[0] + a[1] + a[5];
				System.out.println("Os valores digitados foi: " +a[i] );
		}
		System.out.println("A soma das posiçoes 0, 1 e 5 é: " + soma);
		s.close();
	}

}
