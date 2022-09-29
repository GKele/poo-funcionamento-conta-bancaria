package br.com.override;

public class ContaBancaria{
	//Atributos com vizibilidade privada
	private String cliente;
	private int numConta;
	private float saldo;
	
	//Declaração dos metodos de acesso (Getters e Setters)
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//Métodos com vizibilidade publica
	public void sacar(float valor) {
		if((this.saldo - valor) <= 0) {
			System.out.println("Saque invalido!"); //Não é permitido sacar e ficar em débito
		}
		else {
			this.saldo -= valor; //Equivalente a  saldo -= valor ou saldo = saldo - valor
		}
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	public void mostrarDadosDaConta() {
		System.out.println(this.cliente + " o número da sua conta é: " + this.numConta);
		System.out.println("E o saldo atual é: R$" + this.saldo);
	}
}