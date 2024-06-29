package atvd_06;

public class gato extends mamifero{
	private boolean quadrupede;
	
	public gato (String nome) {
		setNome(nome);
	}
	public gato(int idade, String nome) {
		setIdade(idade);
		setNome(nome);
		
	}
	public gato() {
		setIdade(0);
		setNome("Gato sem nome!");
		setCor("Gato sem cor!");
	}

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
