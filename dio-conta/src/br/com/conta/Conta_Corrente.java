package br.com.conta;

public class Conta_Corrente extends Conta{

	public Conta_Corrente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Conta_Corrente(int numeroConta, double saldo, String nome) {
		super(numeroConta, saldo, nome);
		// TODO Auto-generated constructor stub
	}

	public void depositar(double valor) {
		super.setSaldo((super.getSaldo()+valor));
		System.out.println(super.getNome()+" Conta: "+super.getNumeroConta()+" Saldo atual: "+super.getSaldo());
	}
	
	public void sacar(double valorDoSaque) {
		super.setSaldo((super.getSaldo()-valorDoSaque));
		System.out.println(this.getNome()+" Conta: "+super.getNumeroConta()+" Saldo atual: "+super.getSaldo());
	}

	
	
}
