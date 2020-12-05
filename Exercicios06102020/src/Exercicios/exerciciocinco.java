package Exercicios;
import java.util.Scanner;

public class exerciciocinco {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
float media;
float nota;
float nota1;
float nota2;
nota = ler.nextFloat();
nota1 = ler.nextFloat();
nota2 = ler.nextFloat();
media = nota + nota1 + nota2 / 3;
 if(media < 2) {
	 System.out.println("Sua nota está a baixo da média" + media);
	 
	 		
 }
 else if (media > 2 && media <= 3) {
	 System.out.println("sua nota não está dentro da média, você está de exame");
	 
 }
 else if (media > 3 && media<5) {
	 System.out.println("sua nota está dentro da média");
	 
	 
 }
 else if (media >5) {
	 System.out.println("sua nota está acima da média");
	 
 }
 else {
	 System.out.println("Nota inválida!");
 }
	 
	 
	 
}
}
