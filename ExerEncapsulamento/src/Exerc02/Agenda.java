package Exerc02;
/*void armazenarPessoa(String nome, int idade, float altura);
• void removerPessoa(String nome);
• int buscaPessoa(String nome); // Informa em qual posição da Agenda está a
pessoa.
• void imprimirPessoa(int indice); // imprime os dados da pessoa que está na posição
indicada pelo índice.*/
public class Agenda {
	Pessoa contato[] = new Pessoa[10]; 
	
	public void armazerPessoa(Pessoa pessoa) {
		for( int i = 0; i < contato.length; i++) {
			if (contato[i] == null) {
				contato[i] = pessoa;
				break;
			}
		}
	}
	
	public void removerPessoa(String nome) {
		for (int i = 0; i < contato.length; i++) {
			if (contato[i].getNome() == nome) {
			contato[i] = null;
			}
		}
	}
	
	public int buscarPessoa(String nome) {
		for (int i = 0; i < contato.length; i++) {
			if (contato[i].getNome() == nome) {
			System.out.println("Posição é:" + i);
			}
	}	
		return 0;
	}
	
	public void imprimirPessoa(int indice) {
		System.out.println(contato);
	}
	
	
		
}