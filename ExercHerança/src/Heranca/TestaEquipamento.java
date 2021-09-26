package Heranca;

public class TestaEquipamento {
	public static void main(String [] args) {
		Equipamento n = new Equipamento (332, 33);
		Computador m = new Computador ("Razer", "Redragon");
		/*System.out.println(n.getAltura());
		System.out.println(n.getLargura());
		System.out.println(m.getMouse());
		System.out.println(m.getTeclado());*/
		
		n.mostrarDados();
		m.mostrarDados();
	}
}
