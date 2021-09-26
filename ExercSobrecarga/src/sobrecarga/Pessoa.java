package sobrecarga;

public class Pessoa {
	public int codigo;
	public String nome;
	public int idade;
	
	

	public void mostrarDados() {
		System.out.println("Código " +codigo);
		System.out.println("Nome " + nome);
		System.out.println("Idade " +idade + "\n");
		}
	
	public void mostrarDados(int num ) {
		if (num == 1) {
			System.out.println("Idade " +idade);
			System.out.println("Nome " + nome);
			;System.out.println("Código " +codigo + "\n");}
		else 
			{System.out.println("Código " +codigo);
			System.out.println("Nome " + nome  + "\n");}
	}
	
	public Pessoa() {
		System.out.println("Construtor Padrão \n");
	}
		
	public Pessoa(int codigo, String nome, int idade) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
	}	
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	


	}
	

