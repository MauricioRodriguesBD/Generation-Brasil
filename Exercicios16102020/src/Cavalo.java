
public class Cavalo extends Animal {
	Cavalo(String nome, int idade, String som, String movimentacao) {
		super(nome, idade, som, movimentacao);
		
	}
	 void imprimicavalo() {
		 System.out.println("meu nome � " + nome + "\n" + "Acabei de fazer" + idade + "anos  de maus-tratos" + "\n" + "o som que eu fa�o normalmente �: " + som + "\n" + "Movimenta��o:" + movimentacao);
	 }
	public String getNome() {
		return  super.getNome();
	}
	public int getIdade() {
		return  super.getIdade();
	}
	public String getSom() {
		return  super.getSom();
	}
	public String getMovimentacao() {
		return super.getMovimentacao();
	}
	
	
	

}
