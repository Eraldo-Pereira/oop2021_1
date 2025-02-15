public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	private int id;
	private String disciplina;
	
	public Pessoa() {
		this.nome = "";
		this.sobrenome = "";
		this.idade = 0;
		this.id = 0;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setNome( String nome ) {
		this.nome = nome;
	}
	
	public void setSobrenome( String sobrenome ) {
		this.sobrenome = sobrenome;
	}
	
	public void setIdade( int idade ) {
		this.idade = idade;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId( int id ) {
		this.id = id;
	}
	
	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String toString() {
		return this.getNome() + "/" +
			   this.getSobrenome() + "/" +
			   this.getIdade() + "/" +
			   this.getId() + "/" +
			   this.getDisciplina();
	}
}
