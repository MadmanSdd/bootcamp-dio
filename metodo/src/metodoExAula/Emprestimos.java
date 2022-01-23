package metodoExAula;

import java.util.Scanner;

public class Emprestimos {

	public static void tabelaParcelas(int par,float empresitmoValor) {
		msgTabela();
		float[] parcelas =  new float[par];
		System.out.println("Valor original solicitado "+empresitmoValor);
		for (int i = 0; i < parcelas.length; i++) {
		   parcelas[i] = ((empresitmoValor/2)+(empresitmoValor/2)*5/100);
		   System.out.println((1+i)+" Parcela "+parcelas[i]);
		}
		
	}
	
	private static void msgTabela() {
		System.out.println("Emprestimo");
		System.out.println("Juros de 5%");
		System.out.println("Digite a parcela que deseja");
	}
}
