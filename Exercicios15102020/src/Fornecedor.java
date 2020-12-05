import java.text.NumberFormat;
public class Fornecedor extends Pessoa{
	

	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito,double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		
	}
	
	public double getValorCredito() { 
		return valorCredito;
	}
	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public void obterSaldo() {
		 valorCredito -= valorDivida;
	
	}
	
	public void imprimirdif(){
		System.out.println("A pessoa" + super.getNome() + "Tem um crédito de: " + valorCredito + "E uma divida de: " + valorDivida + "Portanto :");
		
		this.obterSaldo();
		
		System.out.println("O seu saldo é de " + this.moeda());
		
		
		
	}
	public  String moeda() {
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		moeda.setMinimumFractionDigits(2);
		String moedareal = moeda.format(valorCredito);
		return moedareal;
		
	}
}
