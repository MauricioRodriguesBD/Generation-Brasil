package Exercicios;

import java.util.Scanner;

public class exercicioseis {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
double x1,x2,y1,y2,p1,p2,d;
System.out.println("Escreva o valor de x1");
x1 = ler.nextDouble();
System.out.println("Escreva o valor de x2");
x2 = ler.nextDouble();
System.out.println("Escreva o valor de y1");
y1 = ler.nextDouble();
System.out.println("Escreva o valor de y2");
y2 = ler.nextDouble();
p1 = x2 - x1;
p1 = Math.pow(p1, 2);
p2 = y2 - y1;
p2 = Math.pow(p2, 2);
d = p1 + p2;
d = Math.sqrt(2);
System.out.println("O Resultado da Expressão é: " + d);


}
}
