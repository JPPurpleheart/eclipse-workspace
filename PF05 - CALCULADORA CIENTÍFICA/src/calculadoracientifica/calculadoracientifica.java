/**
 * 
 */
package calculadoracientifica;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author josep
 *
 */
public class calculadoracientifica {

	private static Scanner sn;
	private static Double num1;
	private static Double num2;
	private static Double numResult;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean salir = false;
		boolean finoperacion = false;
			while (finoperacion == false) {
				calculadoracientifica.menu(salir, finoperacion);
			}
	}

	public static void menu(boolean salir, boolean finoperacion) {
		sn = new Scanner(System.in);
		calculadoracientifica.mostrarMenu();
		while (salir == false || finoperacion == false) {
			try {
				int opcion = sn.nextInt();
				calculadoracientifica.calcMenu(salir, opcion, finoperacion);
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un n�mero");
				sn.next();
			}
		}

	}

	public static void mostrarMenu() {
		System.out.println("Bienvenido a la Calculadora Cient�fica");
		System.out.println("--------------------------------------");
		System.out.println("Seleccione la operaci�n que desee realizar:");
		System.out.println("1. Suma");
		System.out.println("--------------------------------------");
		System.out.println("2. Resta");
		System.out.println("--------------------------------------");
		System.out.println("3. Multiplicaci�n");
		System.out.println("--------------------------------------");
		System.out.println("4. Divisi�n");
		System.out.println("--------------------------------------");
		System.out.println("5. Potencias");
		System.out.println("--------------------------------------");
		System.out.println("6. Calculo del Resto");
		System.out.println("--------------------------------------");
		System.out.println("7. Seno");
		System.out.println("--------------------------------------");
		System.out.println("8. Coseno");
		System.out.println("--------------------------------------");
		System.out.println("9. Tangente");
		System.out.println("--------------------------------------");
		System.out.println("10. Logaritmo");
		System.out.println("--------------------------------------");
		System.out.println("11. Salir");
	}

	public static void calcMenu(boolean salir, int opcion, boolean finoperacion) {
			switch (opcion) {
			// C�lculo de una suma dados dos sumandos
			case 1:
				System.out.println("Introduce el primer sumando");
				num1 = sn.nextDouble();
				System.out.println(num1);
				System.out.println("--------------------------------------");
				System.out.println("Introduce el segundo sumando");
				num2 = sn.nextDouble();
				System.out.println(num2);
				System.out.println("--------------------------------------");
				numResult = num1 + num2;
				System.out.println("Tu resultado es " + numResult);
				finoperacion = true;
				break;
			// C�lculo de una resta dados minuendo y sustraendo
			case 2:
				System.out.println("Introduce el minuendo");
				num1 = sn.nextDouble();
				System.out.println(num1);
				System.out.println("--------------------------------------");
				System.out.println("Introduce el sustraendo");
				num2 = sn.nextDouble();
				System.out.println(num2);
				System.out.println("--------------------------------------");
				numResult = num1 - num2;
				System.out.println("Tu resultado es " + numResult);
				finoperacion = true;
				break;
			// C�lculo de una multiplicaci�n dados multiplicando y multiplicador
			case 3:
				System.out.println("Introduce el multiplicando");
				num1 = sn.nextDouble();
				System.out.println(num1);
				System.out.println("--------------------------------------");
				System.out.println("Introduce el multiplicador");
				num2 = sn.nextDouble();
				System.out.println(num2);
				System.out.println("--------------------------------------");
				numResult = num1 * num2;
				System.out.println("Tu resultado es " + numResult);
				finoperacion = true;
				break;
			// C�lculo de una divisi�n dados dividendo y divisor
			case 4:
				System.out.println("Introduce el dividendo");
				num1 = sn.nextDouble();
				System.out.println(num1);
				System.out.println("--------------------------------------");
				System.out.println("Introduce el divisor");
				try{
					num2 = sn.nextDouble();
					while (num2 == 0) {
						throw new ArithmeticException ("error");
					}
				} catch(ArithmeticException e) {
					System.out.println("No se puede dividir por cero.");
					System.out.println("--------------------------------------");
					System.out.println("Introduzca un n�mero diferente.");
					num2 = sn.nextDouble();					
				}
				System.out.println(num2);
				System.out.println("--------------------------------------");
				numResult = num1 / num2;
				System.out.println("Tu resultado es " + numResult);
				finoperacion = true;
				break;
				
			// C�lculo de una potencia dados base y exponente
			case 5:
				System.out.println("Introduce la base");
				num1 = sn.nextDouble();
				System.out.println(num1);
				System.out.println("--------------------------------------");
				System.out.println("Introduce el exponente");
				num2 = sn.nextDouble();
				System.out.println(num2);
				System.out.println("--------------------------------------");
				numResult = Math.pow(num1, num2);
				System.out.println("Tu resultado es " + numResult);
				finoperacion = true;
				break;
			// C�lculo del resto de una divisi�n dados dividendo y divisor
			case 6:
				System.out.println("Introduce el dividendo");
				num1 = sn.nextDouble();
				System.out.println(num1);
				System.out.println("--------------------------------------");
				System.out.println("Introduce el divisor");
				num2 = sn.nextDouble();
				System.out.println(num2);
				System.out.println("--------------------------------------");
				numResult = num1 % num2;
				System.out.println("Tu resultado es " + numResult);
				finoperacion = true;
				break;
			// C�lculo del coseno de un �ngulo dado
			case 7:
				System.out.println("Introduce el �ngulo");
				num1 = sn.nextDouble();
				// Convertimos num1 a radianes
				num2 = Math.toRadians(num1);
				System.out.println(num1);
				System.out.println("--------------------------------------");
				numResult = Math.cos(num2);
				System.out.println("Tu resultado es " + numResult);
				finoperacion = true;
				break;
			// C�lculo del seno de un �ngulo dado
			case 8:
				System.out.println("Introduce el �ngulo");
				num1 = sn.nextDouble();
				// Convertimos num1 a radianes
				num2 = Math.toRadians(num1);
				System.out.println(num1);
				System.out.println("--------------------------------------");
				numResult = Math.sin(num2);
				System.out.println("Tu resultado es " + numResult);
				finoperacion = true;
				break;
			// C�lculo de la tangente de un �ngulo dado
			case 9:
				System.out.println("Introduce el �ngulo");
				num1 = sn.nextDouble();
				// Convertimos num1 a radianes
				num2 = Math.toRadians(num1);
				System.out.println(num1);
				System.out.println("--------------------------------------");
				numResult = Math.tan(num2);
				System.out.println("Tu resultado es " + numResult);
				finoperacion = true;
				break;
			// C�lculo del Logaritmo dados un n�mero real positivo y el tipo de logaritmo a implementar
			case 10:
				System.out.println("Introduce un n�mero real positivo");
				num1 = sn.nextDouble();
				System.out.println(num1);
				// Comprobamos que num1 a de ser un n�mero real positivo
				if (num1 >= 0) {
					System.out.println(num1);
				} else {
					System.out.println(
							"Vuelva a intentarlo introduciendo un n�mero real positivo al iniciar la Calculadora Cient�fica");
					sn.next();
					break;
				}
				System.out.println("--------------------------------------");
				System.out.println("Seleccione el tipo de logaritmo a realizar:"
						+ "1. Logaritmo Neperiano, "
						+ "2. Logaritmo en base 10  y "
						+ "3. Logaritmo en base 1p");
				System.out.println("--------------------------------------");
				opcion = sn.nextInt();
				System.out.println("Has seleccionado el tipo" + opcion);
				boolean salirlog = false;
				while(salirlog == false) {
					switch (opcion) {
					case 1:
						numResult = Math.log(num1);
						System.out.println("Tu resultado es " + numResult);
						break;
					case 2:
						numResult = Math.log10(num1);
						System.out.println("Tu resultado es " + numResult);
						break;
					case 3:
						numResult = Math.log1p(num1);
						System.out.println("Tu resultado es " + numResult);
						break;
					default:
						System.out.println("Ingrese una opci�n v�lida entre 1 y 3");
						sn.nextInt();
						if(opcion != 1 || opcion != 2 || opcion != 3) {
							System.out.println("Saliste de la Calculadora Cient�fica");
							salirlog = true;
						}
					}
				}
				finoperacion = true;
				break;
			case 11:
				System.out.println("Saliste de la Calculadora Cient�fica");
				salir = true;
				break;
			default:
				System.out.println("Seleccione una operaci�n o salga de la Calculadora");
			}
	}

}
