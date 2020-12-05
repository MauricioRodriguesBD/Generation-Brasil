package exercicios07102020;

import java.util.Scanner;

public class exerciciotres {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int idade;
	System.out.println("Digite a sua idade");
	idade = ler.nextInt();
	
	
		if(idade >= 10 && idade <= 14) {
			System.out.println("INFANTIL");
		}
		
	
	else if (idade>= 15 && idade<= 17) {
			System.out.println("JUVENIL");
		}
	
	
	else	if(idade >18) {
			System.out.println("ADULTO");
		}
		
	else {
	
		System.out.println("Não categorizado");
	
	
	}
	
}
}
