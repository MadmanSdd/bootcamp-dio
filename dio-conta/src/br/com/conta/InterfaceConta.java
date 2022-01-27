package br.com.conta;

public interface InterfaceConta {

	void depositar(double valor);
	void sacar(double valor);
	void transferencia(Conta contaRecebe,double valor);
}
