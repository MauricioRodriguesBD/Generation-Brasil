import java.util.Scanner;

public class exerciciocinco {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int numero,total=0;
	do {
		System.out.println("Digite um Número Inteiro");
		numero=ler.nextInt();
		total = total + numero;
	}
	while (numero != 0);
	System.out.println("A soma dos Números digitados é: " + total);
}
}
