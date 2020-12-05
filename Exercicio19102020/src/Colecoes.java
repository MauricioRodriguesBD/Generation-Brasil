import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Colecoes {
public static void main(String[] args) {
	Scanner escrever = new Scanner(System.in);
	Collection<String> estoque = new ArrayList();
	estoque.add("Café");
	estoque.add("Leite");
	estoque.add("Cimento");
	estoque.add("Água");
	System.out.println("Estoque" + estoque);
	System.out.println("Adicione mais um item ao estoque");
	Collection<String> estoqueadd = Arrays.asList(escrever.nextLine());
	System.out.println("Qual item você deseja retirar do estoque?");
	estoque.remove(escrever.nextLine());
	
	estoque.addAll(estoqueadd);
	System.out.println("Estoque" + estoque);
	
	for(String adicionar : estoque) {
		System.out.println("Itens do estoque: " + adicionar);
		
	}
	
	
	
	
	
	
}
}
