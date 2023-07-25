package br.com.projeto;

import br.com.classes.Diarista;
import br.com.classes.Cliente;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diarista Diarista = new Diarista();
		
		Diarista.nome = "Bucecleide pinto";
		Diarista.telefone = "(11) 98980-7676";
		Diarista.endereco = "Casa Do Caralho - Rua D - Betânia, Belo Horizonte - MG";
		Diarista.chavePIX = "20comer70correr";
		
		System.out.println("Nome Diarista: " + Diarista.nome);
		System.out.println("Telefone Diarista: " + Diarista.telefone);
		System.out.println("Endereco Diarista: " + Diarista.endereco);
		System.out.println("Chave PIX Diarista: " + Diarista.chavePIX);
		Diarista.atender("José");
		
		System.out.println("================================================");
		
		Cliente cliente = new Cliente();
		
		cliente.nome = "Daniel";
		cliente.telefone = "(11) 89890-3232";
		cliente.endereco = "Chácara Da Família Schvanz - Espigão D'Oeste, RO";
		
		System.out.println("Nome Diarista: " + cliente.nome);
		System.out.println("Telefone Diarista: " + cliente.telefone);
		System.out.println("Endereco Diarista: " + cliente.endereco);
		
		
		
	}

}
