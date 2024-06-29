package atvd_06;

public class testeShapeJava {
	
	public static void main(String[] args) {
		ShapeJava sp = new ShapeJava(15, 15);
		
		ShapeJava sp2 = ShapeJava.getInstancia(16, 16);
		sp2.altura = 16;
	}

}
