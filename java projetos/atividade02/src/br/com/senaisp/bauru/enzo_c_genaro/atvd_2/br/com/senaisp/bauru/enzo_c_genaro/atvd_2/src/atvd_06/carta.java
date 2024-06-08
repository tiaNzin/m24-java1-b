package atvd_06;

public class carta {
	public static final String[] NAIPES = {"♦", "♠", "♥", "♣"};
	public static final String[] NUMEROS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	private String naipe;
	private String numero;
	
	public carta(int np, int vl) {
		if (np<1 || np>4) {
			System.out.println("Naipe Inválido!");
		}
		if (vl<1 || vl>13) {
			System.out.println("Número da carta inválido!");
		}
		
		naipe = NAIPES[np-1];
		numero = NUMEROS[vl-1];
	}
	@override
	public String toString() {
		
		String txt = "┌─────┐\n" +
		             "│     │\n" +
				     "│     │\n" + 
		             "│     │\n" + 
				     "└─────┘\n"; 
		txt = txt.replaceFirst("##", numero);
		txt = txt.replace("§", naipe);
		txt = txt.replaceFirst("##", numero);
		return txt;
	}
	
}
