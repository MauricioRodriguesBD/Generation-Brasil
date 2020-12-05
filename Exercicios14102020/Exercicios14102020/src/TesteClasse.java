
public class TesteClasse {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Maurício");
		cliente.setSobrenome("Rodrigues");
		cliente.setRg(123456789);
		cliente.setcpf(987654321);
		System.out.println("Cliente " + cliente.getNome() + " "+ cliente.getSobrenome());
		System.out.println("RG " + cliente.getRg() );
		System.out.println("CPF " + cliente.getcpf());
		
	} 
}