package clase3_EjC;

import java.util.Scanner;

public class Ejercicio1_c {

	static Integer numeros[] = new Integer[4];
	static int x;
	static int suma=0;

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese el " + (i + 1) + "° numero: ");
			Scanner entrada = new Scanner(System.in);			
			String num = entrada.nextLine();
			numeros[i] = Integer.parseInt(num);
		}
		
		System.out.println("Ingrese el numero X");
		Scanner numerox = new Scanner(System.in);
		String num = numerox.nextLine();
		x = Integer.parseInt(num);

		for (int i = 0; i < 4; i++) {
			if (numeros[i]>x) {
				suma=suma+numeros[i];
			}
		}
		
		System.out.println("el resultado es: " + suma);		
	}
}
