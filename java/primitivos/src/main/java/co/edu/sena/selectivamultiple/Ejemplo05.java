package co.edu.sena.selectivamultiple;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();
		do {
			

			switch (opcion) {
			case 1:
				System.out.println("Opci�n Uno administraci�n ");
				break;
				
			case 2:
				System.out.println("Opci�n dos");
				break;
			case 3:
				System.out.println("Opci�n tres");
				break;
			case 4:
				System.out.println("Opci�n cuatro");
				break;
			case 5:
				System.out.println("Opci�n cinco gracias por usar este software");
				break;
			

			default:
				System.out.println("La opci�n que selecciono no es correcta");

				break;
			}
			
			
		} while (opcion !=5);

	}

}
