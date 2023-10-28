import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Ejercicio7();
		OtraOpcion();

	}

	private static void Ejercicio7() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce una calificación");
		int iNota=sc.nextInt();
		
		switch(iNota) {
			case 1,2,3,4: 
				System.out.println("Insuficiente");
				break; 
			case 5: 
				System.out.println("Suficiente");
				break;
			case 6: 
				System.out.println("Bien");
				break; 
			case 7,8: 
				System.out.println("Notable");
				break; 
			case 9,10: 
				System.out.println("Sobresaliente");
			break; 
			default: 
				System.out.println("Error, la nota debe de estar entre 1 y 10");
				System.exit(0);
		}
		
	}
	private static void OtraOpcion()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce una calificación");
		int iNota=sc.nextInt();
		
		if(iNota>=9)
		{
			System.out.println("Sobresaliente");
		}else if(iNota>=7 && iNota<9) {
			System.out.println("Notable");
		}else if(iNota>5 && iNota<7) {
			System.out.println("Bien");
		}else if(iNota==5) {
			System.out.println("Suficiente");
		}else if(iNota>=0&&iNota<5) {
			System.out.println("Insuficiente");
		}
	}
	
}
