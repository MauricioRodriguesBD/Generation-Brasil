
public class Cliente {
	String nome;
	String sobrenome;
	int rg;
	int cpf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public void setcpf(int cpf) {
		this.cpf = cpf;
		
	}
	public int getcpf() {
		return cpf;
	}
}
