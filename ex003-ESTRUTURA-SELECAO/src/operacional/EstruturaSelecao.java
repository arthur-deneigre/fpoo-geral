package operacional;

public class EstruturaSelecao {

	private String genero;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		
		
		switch(genero) {
		
			case"masculino":
		
				this.genero = genero.toLowerCase();
				
				
				break;
				
			case"feminino":
				
				this.genero = genero.toLowerCase();
				
				break;
				
			case"outros":
				
				this.genero = genero.toLowerCase();
				
				break;
				
			default:
				System.out.println("DADO INVALIDO");
				System.exit(0);
		}
		
		
	}
	
	
}
