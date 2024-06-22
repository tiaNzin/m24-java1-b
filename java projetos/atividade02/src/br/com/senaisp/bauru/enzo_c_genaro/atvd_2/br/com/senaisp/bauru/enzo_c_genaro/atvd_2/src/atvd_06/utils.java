package atvd_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class utils {
	public static int lerInteiro(Scanner sc, String mensagem, int faixaInicial, int faixaFinal) {
		int ret = 0;
		do {
			System.out.println(mensagem);
			
			try {
				ret = sc.nextInt();
				if (ret<faixaInicial || ret>faixaFinal)
					System.out.println("Valor fora das " + "faixas " + "iniciais e finas! " + "Redigite!");
			} catch (InputMismatchException e) {
				ret = faixaInicial - 1;
				System.out.println("Valor inválido!" + " Redigite!");
			}
			
		}while(ret<faixaInicial || ret>faixaFinal);
		return ret;
	}

}
