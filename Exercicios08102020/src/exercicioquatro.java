import java.util.Scanner;

public class exercicioquatro {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	String pessoa;
	int idade,sexo,opcoes=0,QuantidadePessoas = 0;
	int sexof=0,sexom=0,sexoO=0;
	int op1=0,op2=0,op3=0;
	int mulherN=0,homemA=0,outrosC=0;
	int pn=0,pc=0;
	
	while(QuantidadePessoas <=3) {
		System.out.println("Digite a idade");
		idade = ler.nextInt();
		System.out.println("Digite o Sexo, sendo que: \n 1-Feminino \n 2-Masculino \n 3-Outros");
		sexo = ler.nextInt();
		switch(sexo){
			case 1:
				sexof++;
				break;
			case 2:
				sexom++;
				break;
			case 3:
				sexoO++;
				break;
				
				
		}
		
		System.out.println("Digite A opção, sendo que: \n 1- Pessoa Calma \n 2- Pessoa Nervosa \n 3- Pessoa Agressiva");
		opcoes = ler.nextInt();
		switch (opcoes) {
		case 1:
			op1++;
			break;
		case 2:
			op2++;
			break;
		case 3:
			op3++;
			break;
		}
		if(opcoes == 2 && sexo == 1) {
			mulherN++;
		}
		if (opcoes ==3 && sexo ==2) {
			homemA++;
		}
		if (opcoes ==1 && sexo ==3) {
			outrosC++;
		}
		if (idade >=40 && opcoes ==2) {
			pn++;
		}
		if(idade <=18&& opcoes ==1) {
			pc++;
		}
		
		QuantidadePessoas++;
	}
	System.out.println("Pessoas Calmas " + op1);
	System.out.println("Mulheres Nervosas " + mulherN);
	System.out.println("Homem Agressivos "  + homemA);
	System.out.println("Outros Calmos " + outrosC);
	System.out.println("Pessoas nervosas com mais de 40 anos " + pn);
	System.out.println("Pessoas calmas com menos de 18 anos" + pc);
	
	
	
}
}
