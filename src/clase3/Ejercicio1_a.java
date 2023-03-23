package clase3;

public class Ejercicio1_a {
	private String CadenaLetras;
	private char letra;
	private int CantAparece;

	public Ejercicio1_a() {
	}

	public void MetodoMostrar() {
		System.out.println("Desde la clase Class3_Array");
	}

	{
		System.out.println("Desde el MetodoMostrar clase Class3_Array");
	}

	public String getCadenaLetras() {
		return CadenaLetras;
	}

	public int getCantAparece() {
		return CantAparece;
	}

	public void setCantAparece(int cantAparece) {
		CantAparece = cantAparece;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public void setCadenaLetras(String cadenaLetras) {
		CadenaLetras = cadenaLetras;
	}

	public char getLetra() {
		return letra;
	}

	public int CuentaAparicion() {
		for (int indice = 0; indice < CadenaLetras.length(); indice++) {
			char Caracter = CadenaLetras.charAt(indice);
			if (Caracter == letra) {
				CantAparece += 1;
			}
		}
		return CantAparece;
	}

}
