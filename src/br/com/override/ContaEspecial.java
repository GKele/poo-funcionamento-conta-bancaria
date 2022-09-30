package br.com.override;

public class ContaEspecial extends ContaBancaria {
	private float limite;
	
	public ContaEspecial(String cliente, int numConta, float saldo) {
		super(cliente, numConta, saldo);
	}
	
	//Declaração dos metodos de acesso (Getters e Setters)
	public float getLimite(){
		return limite;
	}
	
	public void setLimite(float limite){
		this.limite = limite;
	}
	
	
	//Declaração de método
	public void sacar(float valor) {
		if(((this.getSaldo() - valor) - valor) <= 0){
			System.out.println("Limite para saque alcançado!");
		}
		else {
			this.setSaldo(this.getSaldo() - valor);
		}
	}
}
