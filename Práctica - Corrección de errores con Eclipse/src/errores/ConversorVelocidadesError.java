package errores;

import java.util.Scanner;

public class ConversorVelocidadesError {
	private static Scanner sc;
	private static Scanner sc2;
	private static Scanner sc3;

	public static void main(String[] args) {
		sc3 = new Scanner(System.in);

		System.out.println("1.- Convertir Km/h a m/s");
		System.out.println("2.- Convertir m/s a Km/h");
		int eleccion = sc3.nextInt();
//Las dos opciones válidas son 1 y 2
		if (eleccion == 2 || eleccion == 2) {
			if (eleccion == 1) {
				conversor1();
			}
			if (eleccion == 2) {
				conversor2();
			}
		} else

			System.out.println("Opcion erronea, se escogera por defecto la opcion 1");
		conversor1();
	}


	public static void conversor1() {
		sc = new Scanner(System.in);
		double velocidad;

		System.out.println("Introduzca una velocidad en Km/h: ");
		velocidad = sc.nextDouble();
		System.out.println(velocidad + "Km/h = " + velocidad * 1000 / 3600 + "m/s");
	}

	public static void conversor2() {
		sc2 = new Scanner(System.in);
		double velocidad;

		System.out.println("Introduzca una velocidad en m/s: ");
		velocidad = sc2.nextDouble();
		System.out.println(velocidad + "m/s = " + velocidad * 3600 / 1000 + "Km/h");
	}
}
