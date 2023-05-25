
public class OperadoresLogicos {

	public void testesLogicos() {
		
		/*
		 operadores logicos:
		 && -> and -> e
		 || -> or -> ou
		 ! -> not -> não
		 
		 Exemplo de sintaxe:
		 		 */
		int idadeInicio = 18;
		int idadeFim = 91;
		boolean resultado;
		
		idadeInicio = 18;
		resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		System.out.println(resultado);
		
		idadeInicio = 17;
		resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		System.out.println(resultado);
		
		idadeInicio = 18;
		resultado = (idadeInicio >= 18) || (idadeFim <= 90);
		System.out.println(resultado);
		
		idadeInicio = 17;
		resultado = (idadeInicio >= 18) || (idadeFim <= 90);
		System.out.println(resultado);
	}
}
