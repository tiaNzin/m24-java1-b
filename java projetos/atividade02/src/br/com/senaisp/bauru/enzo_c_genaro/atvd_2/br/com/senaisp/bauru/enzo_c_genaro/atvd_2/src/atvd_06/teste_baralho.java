package atvd_06;

public class teste_baralho {
	
	public static void main(String[] args) {
		Baralho ba = new Baralho();
		Carta ct = ba.sortearCarta();
		System.out.println(ct.toString());
	}

}
