import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Ejercicio8();
	}
	private static void Ejercicio8() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce una frase");
		String sFrase=sc.nextLine();
		String[] palabras = sFrase.split(" ");
        String palabraMasLarga = "";
        int longitudMaxima = 0;

        for (String palabra : palabras) {
            if (palabra.length() > longitudMaxima) {
                palabraMasLarga = palabra;
                longitudMaxima = palabra.length();
            }
        }

        System.out.println("La palabra con más caracteres es: " + palabraMasLarga);
        System.out.println("Número de caracteres: " + longitudMaxima);		
	}

}
