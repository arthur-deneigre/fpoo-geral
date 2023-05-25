import java.util.Scanner;

public class loopWhileSentinela {

	public void loopWhile() {
		
		String sentinela = "";
		Scanner objScanner = new Scanner(System.in);
		
		while (!sentinela.equalsIgnoreCase("sair")) {
			//not true - !
			System.out.println("While ");
			System.out.println("digite um valor ou sair ");
			sentinela = objScanner.next();
			System.out.println("valor digitado " + sentinela);
		}
		
		System.out.println("obrigado por usar nosso programa, VAGABUNDA");
		
	}
	
	
}
