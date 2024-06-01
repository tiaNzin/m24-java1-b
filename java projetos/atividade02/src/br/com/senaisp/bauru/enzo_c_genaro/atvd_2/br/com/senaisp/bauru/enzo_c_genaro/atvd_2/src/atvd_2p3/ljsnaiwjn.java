package atvd_2p3;

import java.util.Scanner;

public class ljsnaiwjn {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite o operando 1: ");
		 int vlr1 = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Digite a operação: ");
		 String operacao = sc.nextLine();
		 System.out.println("Digite o operando 2: ");
		 int vlr2 = sc.nextInt();
		 
		 int valor = 0;
		 
		 switch(operacao) {
		 case "+" : valor = vlr1 + vlr2; break;
		 case "-" : valor = vlr1 - vlr2; break;
		 case "*" : valor = vlr1 * vlr2; break;
		 case "/" : valor = vlr1 / vlr2; break;
		 default: System.out.println("Operação inválida!");
		 }
		 System.out.println("Resultado: " + valor);
		 sc.close();
		 
		 
	 }

}
