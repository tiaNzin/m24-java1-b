package atvd_2p3;

import java.util.Random;
import java.util.Scanner;

public class Forca {
	private String palavraSecreta;
	private int erros;
	private String visualizacao;
	
	public Forca() {
		palavraSecreta = sortearPalavra();
		erros = 0;
		visualizacao = "";
		
		int i = 0;
		while(i<palavraSecreta.length()) {
			visualizacao += "-";
			i++;
		}
		
	}
	private String sortearPalavra() {
		Scanner scA = new Scanner(Forca.class.getResourceAsStream("palavras.txt"));
		Random rnd = new Random();
		int linSort = rnd.nextInt(180)+1;
		int lin = 0;
		String ret="";
		while(scA.hasNextLine()) {
			lin++;
			String linha = scA.nextLine();
			if (lin==linSort) {
				ret = linha;
				break;
			}
		}
		scA.close();
		return ret;
	}
	public void mostrarForca() {
		String linSup = (erros == 0 ? "   " : erros == 1 ? " 0 " : erros == 2 ? "\\0 " : erros > 2 ? "\\0/" : "   " );        
	    String linBod = erros >= 4 ? " |" : "   "; 
	    String linInf = erros == 5 ? "/  " : erros >= 6 ? "/ \\" : "   ";
		System.out.println(" +-----+");
		System.out.println(" |    " + linSup);
		System.out.println(" |    " + linBod);
		System.out.println(" |    " + linInf);
		System.out.println(" |    ");
		System.out.println(" +========");
		System.out.println();
		System.out.println(" " + visualizacao);
		
	}

	public boolean verificaLetra(char letra) {
		boolean ret = false;
		if (palavraSecreta.indexOf(letra)>-1) {
			int i = 0;
			String apoio = "";
			while (i<palavraSecreta.length()) {
				if (palavraSecreta.charAt(i)==letra) {
					apoio += ""+letra;
				} else {
					apoio += ""+visualizacao.charAt(i);
				}
				i++;
			}
			visualizacao = apoio;
			ret = true;
		}else {
			erros++;}
		return ret;
	}
	public boolean isTerminado() {
		return erros>=6 || visualizacao.indexOf('-') == -1;
	}
	public String mostrarPalavra() {
		return palavraSecreta;
	}
}

