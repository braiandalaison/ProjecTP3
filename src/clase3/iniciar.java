package clase3;

import java.util.Scanner;

public class iniciar {

	public static void main(String[] args) {
		System.out.print("Clase 3 Ejercicio 1");
		Ejercicio1_a eje1 = new Ejercicio1_a();

		Scanner palabra = new Scanner(System.in);
		System.out.println("Ingrese Palabra: ");
		String word = palabra.nextLine();
		eje1.setCadenaLetras(word);

		System.out.println("Ingrese letra a buscar:");
		Scanner LetraBuscar = new Scanner(System.in);
		char Letra = (LetraBuscar.nextLine()).charAt(0);
		eje1.setLetra(Letra);

		System.out.println("La letra: " + Letra + " aparece " + 
				eje1.CuentaAparicion() + " veces");

	}

}
