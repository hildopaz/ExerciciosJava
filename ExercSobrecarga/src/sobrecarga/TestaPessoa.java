package sobrecarga;

public class TestaPessoa{
	public static void main(String [] args) {
		Pessoa semParametro = new Pessoa ();
		Pessoa comParametro = new Pessoa (552, "Junior", 15);
		
		semParametro.setCodigo(32);
		semParametro.setNome("Hildo");
		semParametro.setIdade(24);
		
		semParametro.mostrarDados(2);
		comParametro.mostrarDados(3);
	
	}
}