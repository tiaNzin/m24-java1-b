package atvd_06;

public class filhote {
	private static int nSeq = 0;
	private int id;
	private String nome;
	
	
	public filhote(String nome) {
		id = ++nSeq;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}


	
}
