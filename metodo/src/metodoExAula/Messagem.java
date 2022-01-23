package metodoExAula;

public class Messagem {

	public static void msgDia(int numeroHora) {
		if(numeroHora >=5 && numeroHora <= 12) {
			System.out.println("Bom-Dia");
		}else if(numeroHora >12 && numeroHora <=17) {
			System.out.println("Boa Tarde!");
		}else if(numeroHora >= 18 || numeroHora == 00 || ( numeroHora <=4)){
			System.out.println("Boa Noite!");
		}else {
			System.out.println("Numero informado invalido");
		}
			
	}
}
