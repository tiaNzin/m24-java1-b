package atvd_2p2;

import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(ex4.class.getResourceAsStream("dados.cvs"));
		String linha = sc.nextLine();
		Scanner scA = new Scanner (linha);
		scA.useDelimiter(";");
		
		while (scA.hasNext()) {
			System.out.print(scA.next() + "\t\t");
		}
		
		scA.close();
		
		while (sc.hasNextLine()) {
			linha = sc.nextLine();
			scA = new Scanner(linha);
			scA.useDelimiter(";");
			while (scA.hasNext()) {
				System.out.print(scA.next() + "\t");
			}
			System.out.println();
			scA.close();
			
		}
		sc.close();
		
	}

}
