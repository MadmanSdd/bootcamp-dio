package operadores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Operadores Relacional");
		// relacionais();

		System.out.println("=============================");
		System.out.println("Operadores Logico");
		// logico();

		Scanner sc = new Scanner(System.in);

		int L = sc.nextInt();
		int C = sc.nextInt();
		if ( (C+L % 2) == 0)
			System.out.println(" preto  ");
		else // complete o código nos espaços em branco
			System.out.println(" branco  ");
		sc.close();

	}

	public static void relacionais() {
		System.out.println("igual: 1==1 " + (1 == 1));
		System.out.println("maior iqual: 1>=2 " + (1 >= 2));
		System.out.println("menor iqual: 1<=2 " + (1 <= 2));
		System.out.println("diferente: 1!=0 " + (1 != 0));
	}

	public static void logico() {
		if (500 >= 20 && 10 == 30)
			System.out.println("Verdadeiro se as duas condições forem verdadeiro");

		else if (600 == 600 || 20 != 10) {
			System.out.println("Verdadeiro se pelo menos uma for verdadeiro");
		}
		int num = 5, count = 1;
		do {
			num += count;
			System.out.println(num);
		} while (count <= 3);
	}

}
