package br.com.override;

public class ContaPoupanca extends ContaBancaria {
	private int diaDeRendimento;
	
	public ContaPoupanca(String cliente, int numConta, float saldo) {
		super(cliente, numConta, saldo);
	}
	
	//Declaração dos metodos de acesso (Getters e Setters)
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	//Declaração de método
	public void calcularNovoSaldo(float taxa) {
		
		if(this.diaDeRendimento > 10) {
			this.setSaldo(this.getSaldo() * taxa);
		}
		else {
			this.setSaldo((this.getSaldo() * taxa) + 1);
		}
	}
}
