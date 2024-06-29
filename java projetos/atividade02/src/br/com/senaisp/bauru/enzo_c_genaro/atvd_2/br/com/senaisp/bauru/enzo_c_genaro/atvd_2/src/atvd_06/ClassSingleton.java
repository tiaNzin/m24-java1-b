package atvd_06;

public class ClassSingleton {
	private static ClassSingleton instancia = null;
	private static int nSeqInstancia = 0;
	private int id;
	private String nome;
	
	private ClassSingleton() {
		id = ++nSeqInstancia;
		nome = null;
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
	
	public static ClassSingleton getInstancia() {
		if ( instancia==null ) {
			instancia = new ClassSingleton();
		}
		return instancia;
	}
		
	}
	
	

}
