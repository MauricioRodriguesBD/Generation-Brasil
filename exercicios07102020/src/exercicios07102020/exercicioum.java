package exercicios07102020;

import java.util.Scanner;

public class exercicioum {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int a,b,c,d = 0;
	System.out.println("Digite um número");
	a = ler.nextInt();
	System.out.println("Digite um número");
	b = ler.nextInt();
	System.out.println("Digite um número");
	c = ler.nextInt();
	
	if (a > d) {
		d = a;
		if (c > d) {
			d = c;
			 if(b > d) {
				d = b;
	}
		}}
	System.out.println("O maior número dentre os três digitados é : " + d);
	
	
	
	
}
}
