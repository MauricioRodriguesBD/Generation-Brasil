import java.util.Scanner;

public class exerciciodois {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int impar = 0,par = 0,numero;
	for (int i=1;i <=10;i++) {
		System.out.println("digite o "+ i + " Número" );
		numero = ler.nextInt();
		if (numero % 2 == 0) {
			par++;
		}
		else {
			impar++;
		}
	}
	System.out.println("Existem " + par + " Números Pares e " + impar + " Números Impares ");
	
	
	
}
}
