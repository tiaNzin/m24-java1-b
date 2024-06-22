package atvd_06;

public class mamifero {
	private String nome;
	private String cor;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void falar() {
		System.out.println("Mamifero falando");
	}
	@Override
	public String toString() {
		
		return "nome: "+ nome +"\n" + 
				"cor: "+ cor +"\n" + 
				"idade: "+ idade +"\n";
	}

}
