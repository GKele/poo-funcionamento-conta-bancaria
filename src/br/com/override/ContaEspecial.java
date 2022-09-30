package br.com.override;

public class ContaEspecial extends ContaBancaria {
	private float limite;
	
	public ContaEspecial(String cliente, int numConta, float saldo, float limite) {
		super(cliente, numConta, saldo);
		this.limite = limite;
	}
	
	//Declaração dos metodos de acesso (Getters e Setters)
	public float getLimite(){
		return limite;
	}
	
	public void setLimite(float limite){
		this.limite = limite;
	}
	
	
	//Declaração de método
	@Override
	public void sacar(float valor) {
		if(((this.getSaldo() + this.limite) - valor) <= 0){
			System.out.println("Limite para saque alcançado!");
		}
		else {
			this.setSaldo(this.getSaldo() - valor);
		}
	}
}
