package atvd_06;

public class testeCarta {
	
	public static void main(String[] args) {
		Carta ct;
		try {
			ct = new Carta (4, 13);
			System.out.println(ct.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
