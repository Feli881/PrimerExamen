import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Ejercicio6();

	}

	private static void Ejercicio6() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce una frase");
		String sFrase=sc.nextLine();
		
		  int contadorLetras = 0;
	        int contadorDigitos = 0;

	        for (int i = 0; i < sFrase.length(); i++) {
	            char caracter = sFrase.charAt(i);
	            if (Character.isLetter(caracter)) {
	                contadorLetras++;
	            } else if (Character.isDigit(caracter)) {
	                contadorDigitos++;
	            }
	        }

	        System.out.println("Número de letras: " + contadorLetras);
	        System.out.println("Número de dígitos: " + contadorDigitos);
	}

}
