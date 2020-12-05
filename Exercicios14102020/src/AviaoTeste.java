
public class AviaoTeste {
	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		aviao.setCombustivel(999999);
		aviao.setEmpresa("TAM");
		aviao.setModelo("ModeloX");
		aviao.setPrefixo("AviaoY");
		System.out.println("AViao da Empresa" + aviao.getEmpresa());
		System.out.println("Modelo do avião " + aviao.getModelo());
		System.out.println("Prefixo" + aviao.getPrefixo());
		System.out.println("Capacidade " + aviao.getCombustivel() + " Litros");
	}
}
