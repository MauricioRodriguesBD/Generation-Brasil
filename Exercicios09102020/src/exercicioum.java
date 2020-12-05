import java.util.Scanner;

public class exercicioum {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int[] arrayum = new int[6];
	int soma,v;
	for(v=0;v<6;v++) {
		System.out.println("Digite 6 números");
		arrayum[v] = ler.nextInt();
		
		
	}
	
	soma =  arrayum[0] + arrayum[1] + arrayum[5];
	
	System.out.println("A soma dos Vetores 0 1 5 é :  " + soma);
	arrayum[4] = 100;
	System.out.println("A posição 4 do vetor vale agora:" + arrayum[4]);
	for(v=0;v<6;v++) {
		System.out.println(arrayum[v]);
		
	}
	
}
}
