package Exercicios;

import java.util.Scanner;




public class exerciciotres {
	public static void main(String[] args) {
		System.out.println("Expressão");
	
Scanner ler = new Scanner(System.in);
double a,b,c,r,s,d;


System.out.println("Digite o valor de A");
a = ler.nextFloat();
System.out.println("Digite o valor de B");
b = ler.nextFloat();
System.out.println("Digite o valor de C");
c = ler.nextFloat();
r = a + b;
r = Math.pow(r, 2);
System.out.println("Valor de R: " + r);
s = c + b;
s = Math.pow(s, 2);
System.out.println("Valor de S: " + s);
d = r + s / 2;
System.out.println("Resultado da Expressão: ");




}
}