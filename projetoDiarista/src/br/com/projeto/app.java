package br.com.projeto;

import br.com.classes.Diarista;
import br.com.classes.Atendimento;
import br.com.classes.Cliente;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diarista Diarista = new Diarista();
		
		Diarista.setNome("Bucecleide pinto");
		Diarista.setTelefone("(11) 98980-7676");
		Diarista.setEndereco("Casa Do Caralho - Rua D - Betânia, Belo Horizonte - MG");
		Diarista.setChavePIX("20comer70correr");
		
		System.out.println("Nome Diarista: " + Diarista.getNome());
		System.out.println("Telefone Diarista: " + Diarista.getTelefone());
		System.out.println("Endereco Diarista: " + Diarista.getEndereco());
		System.out.println("Chave PIX Diarista: " + Diarista.getChavePIX());
		System.out.println("Saldo Diarista: " + Diarista.getSaldo());
		Diarista.depositar(30);
		System.out.println("novo saldo: " + Diarista.getSaldo());
		Diarista.atender("José");
		
		System.out.println("================================================");
		
		
		
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Daniel");
		cliente.setTelefone("(11) 89890-3232");
		cliente.setEndereco( "Chácara Da Família Schvanz - Espigão D'Oeste, RO");
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Telefone Cliente: " + cliente.getTelefone());
		System.out.println("Endereco Cliente: " + cliente.getEndereco());
		System.out.println("Saldo Cliente: " + cliente.getSaldo());
		cliente.depositar(30);
		System.out.println("novo saldo: " + cliente.getSaldo());
	
		System.out.println("================================================");
		
		
		
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(12);
		System.out.println(atendimento.getHoras());
		
		
		
		
	}

}
