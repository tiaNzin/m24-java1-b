package atvd_2p3;

import java.util.Scanner;

public class garena_palace {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite uma data no" + "formato dd/mm/aaaa:");

	public static void main(String[] args) {
		String linha = sc.nextLine();
		Scanner scA = new Scanner(System.in);
		sc.useDelimiter("/");
		int dia = scA.nextInt();
		int mes = scA.nextInt();
		int ano = scA.nextInt();
		boolean valido = true;
		
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia<1 || dia>31);
				valido = false;
		}
		break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia<1 || dia>31) {
				valido = false;
			}
			break;
			
		case 2:
			if(dia<1 || dia>28) {
				valido = false;
				
				
				
					
			} else if (dia == 29 && ano % 4 != 0) {
				valido = false;
			} else if (dia == 29 && ano % 4 == 0 && ano % 100 == 0 && ano % 400 != 0) {
				valido = false;
			
			}
			break;
			
			default: 
				System.out.println("mês Inválido!");
				valido = false;
	}
	
	if(valido) {
		System.out.println("Data é válida!");
	}else

}
