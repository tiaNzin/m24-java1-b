package br.com.senaisp.bauru.enzo_c_genaro.atvd_2;

import java.util.Scanner;

public class kkkk {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite seu nome completo:");
		nome = scn.nextLine();
		
		String primNome = nome.substring(0, (nome + " ").indexOf(" "));
		
		String lastName = nome.substring(nome.lastIndexOf(" ") + 1);
		
		System.out.println(primNome);
		System.out.println(lastName);
		
		scn.close();

	}

}
