import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Ejercicio3();
	}

	private static void Ejercicio3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce tu nombre ");
		String sNombre=sc.nextLine();
		
		String[] partes=sNombre.split(" ");
		
		System.out.println("Nombre: "+partes[0]);
		System.out.println("Apellido1: "+partes[1]);		
		System.out.println("Apellido2: "+partes[2]);	
	}

}
