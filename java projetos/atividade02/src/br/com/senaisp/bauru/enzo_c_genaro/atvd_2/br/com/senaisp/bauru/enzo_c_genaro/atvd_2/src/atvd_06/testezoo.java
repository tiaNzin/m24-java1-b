package atvd_06;

public class testezoo {

	public static void main(String[] args) {
		mamifero mam = new gato(5,"John");
		mam.setCor("Caramelo");
		mam.setNome("Totó");
		mam.setIdade(3);
		if (mam instanceof Cachoro) {
			((Cachoro) mam).setQuadrupede(true);
		}
		mam.falar();
		System.out.println(mam.toString());
	}

}
