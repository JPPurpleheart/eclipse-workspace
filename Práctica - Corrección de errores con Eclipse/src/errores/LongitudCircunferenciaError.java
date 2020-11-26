package errores;

import java.util.Scanner;

public class LongitudCircunferenciaError {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double radio;
		double longitud;
		double area = 0;

		System.out.println("Introduce el radio de la circunferencia: ");
		radio = sc.nextDouble();
		calculaArea(radio);
		System.out.println("El area de la circunferencia es: " + area);
		longitud = calculaLongitud(radio);
		System.out.println("La longitud de la circunferencia es: " + longitud);
	}

	public static double calculaArea(double r) {
		double a;

		a = Math.PI * Math.pow(r, 2);

		return a;
	}

	public static int calculaLongitud(double r) {
		double l;

		l = 2 * Math.PI * r;

		return (int) l;
	}
}
