package Heranca;

public class Computador extends Equipamento {
	private String mouse;
	private String teclado;
	
	public Computador(int largura, int altura) {
		super(largura, altura);
	}
	
	public Computador() {
		
	}
	
	public Computador(String mouse, String teclado) {
		this.mouse = mouse;
		this.teclado = teclado;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public String getTeclado() {
		return teclado;
	}

	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}
	
	public void mostrarDados() {
		System.out.println("Mouse: " + mouse);
		System.out.println("Teclado: " +teclado);
	}
	
}
