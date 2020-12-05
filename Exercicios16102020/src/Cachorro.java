
public class Cachorro extends Animal {
	
	 Cachorro(String nome,int idade,String som,String Movimentacao) {
		super(nome,idade,som,Movimentacao);
	}
	
	
	public String getNome() {
		return "Nome " + super.getNome();
	}
	public int getIdade() {
		System.out.println("Idade ");
		return  super.getIdade();
	}
	public String getSom() {
		
		return super.getSom();
	}
	public String getMovimentacao() {
		return "Movimentation " + super.getMovimentacao();
	}

	
}
