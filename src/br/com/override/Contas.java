package br.com.override;

public class Contas {
	public static void main(String[] args){
		ContaBancaria obj1 = new ContaBancaria("Beatriz", 1234, 1500);
		obj1.mostrarDadosDaConta();
		obj1.depositar(300);
		obj1.mostrarDadosDaConta();
		
		//============================
		
		ContaPoupanca obj2 = new ContaPoupanca("Joaquim", 9876, 600);
		obj2.depositar(500);
		
	}
}
