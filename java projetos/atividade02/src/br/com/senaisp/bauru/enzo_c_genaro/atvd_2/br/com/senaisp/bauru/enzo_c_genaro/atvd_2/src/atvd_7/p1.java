package atvd_7;

import java.util.Scanner;

public class p1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] valores;
		System.out.println("Digite o número de elementos " + "que você deseja?");
		int qtde = sc.nextInt();
		valores = new int[qtde];
		
		for(int i=0;i<valores.length;i++) {
			System.out.println("Digite o elemento "+(i+1)+":");
			valores[i] = sc.nextInt();
		}
		int maior=Integer.MIN_VALUE,soma=0;
		for (int el : valores) {
			soma += el;
			if (el>maior) {
				maior = el;
			}
		}
		System.out.println("Maior valor: " + maior);
		System.out.println("Média: " + (soma / valores.length));
		System.out.println("Soma: " + soma);
		sc.close();
	}
	
}
