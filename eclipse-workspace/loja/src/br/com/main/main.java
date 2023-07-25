package br.com.main;

import br.com.classes.veiculo;

public class main {

	public static void main(String[] args) {
		
		//logan
		veiculo logan = new veiculo();
		logan.nome = "Logan";
		logan.cor = "Branco";
		logan.motor = "16vc";
		logan.velocidade = 160;
		
		logan.ligar();
		
		System.out.println("nome: " + logan.nome);
		System.out.println("cor: " + logan.cor);
		System.out.println("motor: " + logan.motor);
		System.out.println("velocidade: " + logan.velocidade);
		
		
		//corsa
		veiculo corsa = new veiculo();
		corsa.nome = "corsa";
		corsa.cor = "cinza";
		corsa.motor = "16vc";
		corsa.velocidade =120;
		
		corsa.ligar();
		
		System.out.println("nome: " + corsa.nome);
		System.out.println("cor: " + corsa.cor);
		System.out.println("motor: " + corsa.motor);
		System.out.println("velocidade: " + corsa.velocidade);
		
		logan.desligar();
		corsa.desligar();
		

	}

}
