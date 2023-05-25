import java.util.Scanner;

public class loopDoWhile {
	
	//loopDoWhile contador

	public void loopDo() {
		
		int contador = 11;
		
		do {
		
		System.out.println("o valor do contador do loop do...while  é: " + contador);	
		contador++;	
		} while (contador <=10);
		
		
		
	}
	//loopDoWhile sentinela
	
	public void loopDoSentinela() {
		String opcao = "";
		Scanner objScanner = new Scanner(System.in);
		
		do {
			System.out.println("do...while");
			System.out.println("digite um valor ou sair");	
			opcao = objScanner.next();	
		}while(opcao.equalsIgnoreCase("valor digitado " + opcao));
		
		System.out.println("obrigado por usar nosso programa, VAGABUNDA");
		
	}
	
	
}



	

