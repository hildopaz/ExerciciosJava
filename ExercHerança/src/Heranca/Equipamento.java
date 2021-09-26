package Heranca;

public class Equipamento {
	private int largura;
	private int altura;

	public Equipamento () {
		
	}
	public Equipamento(int largura, int altura) {
		this.altura = altura;
		this.largura = largura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}

	
	
	public void mostrarDados() {
		System.out.println("Largura: " +largura);
		System.out.println("Altura: " +altura);
	}
}

