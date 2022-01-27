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
	
	public void depositar(double valor) {
		this.saldo+= valor;
		System.out.println(this.nome+" Conta: "+this.numeroConta+" Saldo atual: "+this.saldo);
	}
	
	public void sacar(double valorDoSaque) {
		this.saldo-= valorDoSaque;
		System.out.println(this.nome+" Conta: "+this.numeroConta+" Saldo atual: "+this.saldo);
	}
	
	public static void transferencia(Conta contaAtual,double valorTrans,Conta contaRecebe) {
		contaAtual.saldo-=valorTrans;
		contaRecebe.saldo+=valorTrans;
		System.out.println("Transferencia Realizado com sucesso!");
		System.out.println("Conta Atual: "+contaAtual.getNumeroConta()+" Nome: "+contaAtual.getNome()
		+" Saldo Disponivel: "+contaAtual.getSaldo()
		+" Conta Transferida: "+contaRecebe.getNumeroConta());
	}
	
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", saldo=" + saldo + ", nome=" + nome + "]";
	}
	
}
