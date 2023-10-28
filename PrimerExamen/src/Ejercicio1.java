import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Ejercicio1();
	}

	private static void Ejercicio1() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Escibe un número ");
		int iNumero=sc.nextInt();
		
		switch(iNumero) {
		case 1: 
			System.out.println("Lunes");
			break;
		case 2: 
			System.out.println("Martes");
			break;
		case 3: 
			System.out.println("Miercoles");
			break;
		case 4: 
			System.out.println("Jueves");
			break;
		case 5: 
			System.out.println("Viernes");
			break;
		case 6: 
			System.out.println("Sábado");
			break;
		case 7: 
			System.out.println("Domingo");
			break; 
			default: 
				System.out.println("Error, el número debe estar entre 1 y 7");
				System.exit(0);
		}
			
	}
	

}
