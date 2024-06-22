package atvd_06;

public class gato extends mamifero{
	private boolean quadrupede;

	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	public void falar() {
		System.out.println("miau miau miau!");
	}

}
