import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Ejercicio2();
	}

	private static void Ejercicio2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu nombre completo");
		String sNombre=sc.nextLine();
		
		System.out.println("El nombre completo en mayúsculas es: "+sNombre.toUpperCase());
	}

}
