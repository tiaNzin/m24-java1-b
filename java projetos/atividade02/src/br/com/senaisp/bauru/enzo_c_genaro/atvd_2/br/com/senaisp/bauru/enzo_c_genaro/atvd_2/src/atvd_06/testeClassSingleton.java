package atvd_06;

public class testeClassSingleton {

	public static void main(String[] args) {
		ClassSingleton obj01 = new ClassSingleton.getInstancia();
		ClassSingleton obj02 = new ClassSingleton.getInstancia();
		//
		System.out.println(obj01);
		System.out.println(obj02);
		//
		obj01.setNome("Robson");
		System.out.println(obj02.getNome());

	}

}
