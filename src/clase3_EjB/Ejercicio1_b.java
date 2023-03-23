package clase3_EjB;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1_b {
	static Integer numeros[] = new Integer[3];
	static int orden;// 0 asc, 1 desc

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingrese el " + (i + 1) + "° numero: ");
			String num = entrada.nextLine();
			numeros[i] = Integer.parseInt(num);
		}

		Scanner entradaOrden = new Scanner(System.in);
		System.out.println("Ingrese 0 para orden ascendente " 
		+ "o 1 para orden descendente");
		String num = entradaOrden.nextLine();
		orden = Integer.parseInt(num);

		System.out.println("Los numeros ingresados son: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(numeros[i]);
		}
		if (orden == 0) {
			System.out.println("El arreglo en orden ascendente es : ");
			Arrays.sort(numeros);
		} else {
			System.out.println("El arreglo en orden descendente es : ");
			Arrays.sort(numeros, Collections.reverseOrder());
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(numeros[i]);
		}

	}

}
