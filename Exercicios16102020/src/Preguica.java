
public class Preguica extends Animal {
	Preguica(String nome, int idade, String som, String movimentacao) {
		super(nome, idade, som, movimentacao);
		
	}
	public String getNome() {
		return " Meeuu Noooom ee�e " + super.getNome();
	}
	public int getIdade() {
		return 4 + super.getIdade();
	}
	public String getSom() {
		return  super.getSom();
	}
	public String getMovimentacao() {
		return "Hoje n�o" + super.getMovimentacao();
	}

}
