package metodoExAula;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Calculadora");
		System.out.println("Soma "+Calculadora.soma(2, 3));
		System.out.println("Sub "+Calculadora.subtracao(3, 2));
		System.out.println("Mult "+Calculadora.multiplicao(2, 3));
		System.out.println("Soma "+Calculadora.divisao(4, 2));
		System.out.println("Soma "+Calculadora.rest_Divisao(5, 4));
		
		System.out.println("=====================================");
		Emprestimos.tabelaParcelas(2,500);
		
		System.out.println("=====================================");
		System.out.println("Mensagem Bom dia| Boa tarde | Boa noite");
		Messagem.msgDia(00);
	}

}
