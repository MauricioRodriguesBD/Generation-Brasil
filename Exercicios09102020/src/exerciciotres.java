import java.util.Scanner;

public class exerciciotres {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valores =0;
		int[][] matriz = new int[3][3];
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++){
				System.out.printf("Insira os valores da Matriz [%d][%d]" , linha+1 , coluna+1);
				matriz[linha][coluna] = ler.nextInt();
				
			}
		}
		System.out.println("\n MATRIZ \n");
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++){
			
				System.out.printf( "\t %d \t", matriz[linha][coluna]);
	
	}
			System.out.println();
			}
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++){
		if(matriz[linha][coluna] >10) {
			valores++ ;
		
		}
			}
		}
		System.out.println("Existem " + valores + " Valores maiores que 10 na Matriz");
		}
}
