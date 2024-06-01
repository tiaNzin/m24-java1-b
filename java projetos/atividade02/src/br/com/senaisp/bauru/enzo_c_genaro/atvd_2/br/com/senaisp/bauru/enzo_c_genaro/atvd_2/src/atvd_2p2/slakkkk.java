package atvd_2p2;

import java.util.Scanner;

public class slakkkk {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		
		Scanner scA = new Scanner(nome);
		String primeiroNome="", ultimoNome="";
		
		while (scA.hasNext()) {
			ultimoNome = scA.next();
			if (primeiroNome.equals("")) {
				primeiroNome = ultimoNome;
				
			}
			
		}
		System.out.println("Primeiro nome: " + )
		
		
	}

}
