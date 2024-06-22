package atvd_06;

import java.util.InputMismatchException;
import java.util.Scanner;


public class exemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vlr01 = 0, vlr02;
		
		do {
		
			System.out.println("Digite o " + "primeiro valor:");
			try {
				vlr01 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println();
				e.printStackTrace();
			}
			
		} while(vlr01<+0);
		vlr02 = utils.lerInteiro(sc, "Digite o segundo valor", 1, Integer.MAX_VALUE);
		int vlr03 = vlr01/vlr02;
		System.out.println("Resultado: " + vlr03);
		sc.close();
		

	}

}
