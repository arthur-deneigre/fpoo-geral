
public class maiorValor {

	int n1 = 500;
	int n2 = 400;
	int n3 = 600;
	
	public void testeMaior1() {
		
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("n1 é o maior valor");
			}
		}
		if (n2 > n1) {
			if (n2 > n3) {
				System.out.println("n2 é o maior valor");
			}
		}
		if (n3 > n1) {
			if (n3 > n2) {
				System.out.println("n3 é o maior valor");
			}
		}
	}
	public void testeMaior2() {
		
		if((n1 > n2) && (n1 > n3)) {
			System.out.println("n1 é o maior valor");
			
		}
		if((n2 > n1) && (n2 > n3)) {
			System.out.println("n2 é o maior valor");
			
		}
		if((n3 > n1) && (n3 > n2)) {
			System.out.println("n3 é o maior valor");
		}
	}
}
