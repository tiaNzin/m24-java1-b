package br.com.senaisp.bauru.enzo_c_genaro.atvd_2;

public class EstudanteTester {
	
	public static void main(String[] args) {
		
		Estudante est01 = new Estudante();
		est01.setNome("Enzo");
		est01.setId(1);
		est01.setMedia(5.5f);
		
		System.out.println("Nome:" + est01.getNome());
		System.out.println("Documento" + est01.getDocumento());
		
		System.out.println(est01.toString());
		
		Estudante est02 = new Estudante(2, "Leonardo", "12345678900", 9.6f, 1600.00, true);
		
		System.out.println(est02.toString());
			
			est02 = new Estudante();
			est02.setNome("Leonardo");
			est02.setId(2);
			est02.setMedia(5.5f);
			
			System.out.println("Nome:" + est02.getNome());
			System.out.println("Documento" + est02.getDocumento());
			
			System.out.println(est02.toString());
	}

}
