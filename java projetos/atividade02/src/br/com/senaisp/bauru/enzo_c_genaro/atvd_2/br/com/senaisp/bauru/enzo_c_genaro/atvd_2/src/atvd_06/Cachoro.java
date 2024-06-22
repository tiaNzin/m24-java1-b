package atvd_06;

public abstract class Cachoro extends mamifero{
	private boolean quadrupede;

	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	public void falar() {
		System.out.println("au au au!");
	}
}