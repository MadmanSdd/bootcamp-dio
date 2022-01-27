package br.com.conta;

public abstract class Conta {

	private int numeroConta;
	private double saldo =0;
	private String nome;
	
	public Conta(int numeroConta, double saldo, String nome) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.nome = nome;
	}
	
	public Conta() {
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", nome=" + nome + "]";
	}
	
}
