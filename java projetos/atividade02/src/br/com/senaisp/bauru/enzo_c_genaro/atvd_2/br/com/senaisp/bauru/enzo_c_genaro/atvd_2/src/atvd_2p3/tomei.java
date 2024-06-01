package atvd_2p3;

import java.util.Scanner;

public class tomei {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.println(idade > 17 ? "Você é maior de idade!" : "Você é menor de idade!");
		sc.close();

	}

}
