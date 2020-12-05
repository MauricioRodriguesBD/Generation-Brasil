
public class Animal {
	String nome;
	int idade;
	String som;
	String movimentacao;
	
	Animal (String nome,int idade,String som,String movimentacao) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.movimentacao = movimentacao;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(final String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(final String som) {
		this.som = som;
	}
	public String getMovimentacao() {
		return movimentacao;
	}
	public void setMovimentacao(final String movimentacao) {
		this.movimentacao = movimentacao;
	}
	public void setSomAnimal(final String som) {
		this.som = som;
	}
	
	
}
