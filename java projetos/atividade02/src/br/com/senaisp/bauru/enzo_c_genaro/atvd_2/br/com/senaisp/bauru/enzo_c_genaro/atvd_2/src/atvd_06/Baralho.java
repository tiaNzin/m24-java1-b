package atvd_06;


import java.util.Random;

public class Baralho {
	private Carta[] cartas;
	private boolean[] cartaUsada;
	
	public Baralho() {
		cartas = new Carta[Carta.NAIPES.length * Carta.NUMEROS.length];
		cartaUsada = new boolean[cartas.length];
		
		for(int np=1;np<=Carta.NAIPES.length;np++) {
			for(int nm=1;nm<=Carta.NUMEROS.length;nm++)  {
				int idx = (np-1) * Carta.NUMEROS.length + (nm - 1);
				try {
					cartas[idx] = new Carta(np,nm);
				} catch (Exception e) {
					e.printStackTrace();
				}
				cartaUsada[idx] = false;
			}
		}
	}
	public Carta sortearCarta() {
		Random rnd = new Random();
		boolean sorteado = false;
		Carta ret = null;
		do {
			int sor = rnd.nextInt(cartas.length);
			if (!cartaUsada[sor]) {
				cartaUsada[sor] = true;
				ret = cartas[sor];
				sorteado = true; 
			}
		}while (!sorteado);
		return ret;
	}
}

