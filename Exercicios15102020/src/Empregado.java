import java.text.NumberFormat;

public class Empregado extends Pessoa{
	private float codigosetor;
	private float salariobase;
	private float imposto;
	
	public Empregado(String nome, String endereco, String telefone, float codigosetor, float salariobase){
		super(nome,endereco,telefone);
		this.codigosetor = codigosetor;
		this.salariobase = salariobase;
		
	}
	public void imprimiEmp() {
		super.imprimirInfo();
		System.out.println("Código do setor " + codigosetor + " Salário " + salariobase + " desconto de impostos " + imposto + "% Baseado no salário");
			this.calcularSalario();
		
		System.out.println("O seu Salário é de " + this.moeda());
	}

	public float getcodigosetor() {
		return codigosetor;
	}

	public void setcodigosetor(float codigosetor) {
		this.codigosetor = codigosetor;
	}

	public float getSalariobase() {
		return salariobase;
	}

	public void setSalariobase (float salariobase) {
		this.salariobase = salariobase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(int imposto) {
		this.imposto = imposto;
	}
	public void calcularSalario() {
		imposto = salariobase * (imposto / 100);
		salariobase = salariobase - imposto;
	}
	public  String moeda() {
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		moeda.setMinimumFractionDigits(2);
		String moedareal = moeda.format(salariobase);
		return moedareal;
	
}
}
