package atvd_06;

public class Carta {
	public static final String[] NAIPES = {"♦", "♠", "♥", "♣"};
	public static final String[] NUMEROS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	private String naipe;
	private String numero;
	
	public Carta(int np, int vl) throws Exception {
		if (np<1 || np>4) {
			throw new Exception("Naipe Inválido!");
				
		}
		if (vl<1 || vl>13) {
			throw new Exception("Número da carta inválido!");
		}
		
		naipe = NAIPES[np-1];
		numero = NUMEROS[vl-1];
	}
	@override
	public String toString() {
		
		String txt = "┌─────┐\n" +
		             "│##   │\n" +
				     "│  §  │\n" + 
		             "│   ##│\n" + 
				     "└─────┘\n"; 
		txt = txt.replaceFirst("##", numero + (numero.equals("10") ? "" : " "));
		txt = txt.replace("§", naipe);
		txt = txt.replaceFirst("##", (numero.equals("10") ? "" : " ") + numero);
		return txt;
	}
	
}
