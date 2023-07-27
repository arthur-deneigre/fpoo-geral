package br.com.classes;

public class Diarista extends pessoa{
	
	
	protected String ChavePIX;
	
	public String getChavePIX() {
		return ChavePIX;
	}


	public void setChavePIX(String chavePIX) {
		ChavePIX = chavePIX;
	}


	public void atender(String nomeCliente) {
		
		System.out.println("realizando atendimento para o cliente: " + nomeCliente);
	}


	@Override
	public void sacar(int valor) {

		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
	}


	@Override
	public void depositar(int valor) {
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor;
		this.setSaldo(novoSaldo);

		
	}

}
