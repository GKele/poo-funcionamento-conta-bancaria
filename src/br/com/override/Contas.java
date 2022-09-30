package br.com.override;

public class Contas {
	public static void main(String[] args){
		ContaBancaria obj1 = new ContaBancaria("Beatriz", 1234, 1500);
		obj1.mostrarDadosDaConta();
		obj1.depositar(300);
		obj1.mostrarDadosDaConta();
		obj1.sacar(2000);
		obj1.mostrarDadosDaConta();
		
		System.out.println("============================");
		System.out.println("============================");
		
		ContaPoupanca obj2 = new ContaPoupanca("Joaquim", 9876, 600, 3); //nome, numero da conta, saldo e dia de rendimento
		obj2.depositar(500);
		obj2.mostrarDadosDaConta();
		obj2.calcularNovoSaldo(4);
		obj2.mostrarDadosDaConta();
		obj1.sacar(2000);
		obj2.mostrarDadosDaConta();
		
		System.out.println("============================");
		System.out.println("============================");
		
		ContaEspecial obj3 = new ContaEspecial("Maria", 7546, 4000, 1000);
		obj3.depositar(2000);
		obj3.mostrarDadosDaConta();
		obj3.sacar(6500);
		obj3.mostrarDadosDaConta();
		obj3.sacar(100);
		obj3.mostrarDadosDaConta();
		obj3.sacar(1000);
		obj3.mostrarDadosDaConta();
	}
}
