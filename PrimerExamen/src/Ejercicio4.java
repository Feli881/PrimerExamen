import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Ejercicio4();

	}

	private static void Ejercicio4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Por favor, introduce un radio");
		double dRadio=sc.nextDouble();
		
		double dLongitud= 2* 3.14* dRadio;
		
		System.out.println("La longitud de la circunferencia es: "+dLongitud);
		
	}

}
