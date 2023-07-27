package br.com.classes;

public class Atendimento {
	
	
	public int horas;

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
		
		if (horas >= 1 && horas <= 12) {
			
			System.out.println("Parabens atendimento finalizado");
			
		} else {
			
			this.horas = horas;
			System.out.println("Atendimento fora do horario comercial");
		}
			
	}
	
	

}
