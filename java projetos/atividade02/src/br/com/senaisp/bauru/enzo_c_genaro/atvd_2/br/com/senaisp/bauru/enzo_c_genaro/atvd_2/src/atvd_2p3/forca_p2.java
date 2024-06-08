package atvd_2p3;

import java.util.Scanner;

public class forca_p2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Forca fo = new Forca();
		fo.mostrarForca();
		String palavra="";
		while (!fo.isTerminado()) {
			System.out.println("Digite uma letra: ");
			palavra = sc.nextLine();
			if (!fo.verificaLetra(palavra.charAt(0))) {
				System.out.println("Letra não encontrada!");
			}
			fo.mostrarForca();
		}
		sc.close();
		System.out.println("a palavra era: " + fo.mostrarPalavra());
	}
}
