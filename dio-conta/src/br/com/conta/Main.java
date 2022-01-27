package br.com.conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta_Corrente cc1 = new Conta_Corrente(123,600,"jose silva");
		System.out.println(cc1.toString());
		cc1.depositar(200);
		System.out.println(cc1.toString());
		cc1.sacar(800);
		
		Poupanca p1 = new Poupanca(343,300,"Maria viviane");
		Conta.transferencia(p1, 100, cc1);
		System.out.println(cc1.toString());

	}

}
