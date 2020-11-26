package arrays;

import java.util.Scanner;

public class arrays2 {

	
	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		
		int [] enteros = new int[10];
		int elementos = 0;
		
		do {
			System.out.println("Introduce un elemento");
			enteros[elementos] = teclado.nextInt();
			elementos++;

			System.out.println("Introduce T para terminar, cualquier otra cosa para seguir");
			if (teclado.next().toLowerCase().charAt(0) == 't')
				break;

		} while (elementos < 10);
		
		imprimirArray(enteros, elementos);
		ordenaArrayIntercambio(enteros, elementos);
		imprimirArray(enteros, elementos);
		
		
	}
	
	public static void imprimirArray(int [] array, int numElem) {
		
		System.out.print("{");
		for (int i = 0;i<numElem;i++) {
					
			System.out.print(array[i]);
			
			if(i<numElem-1)
				System.out.print(", ");
			
		}
		System.out.print("}");
	}
	
	public static void ordenaArrayIntercambio(int [] numeros, int numElem) {
		
		for (int columna = 0; columna < numElem-1; columna++) {
			for (int elemento = columna+1; elemento < numElem; elemento++) {
				
				if(numeros[columna]>numeros[elemento]) {
					int aux = numeros[columna];
					numeros[columna]=numeros[elemento];
					numeros[elemento]=aux;
				}
				
			}
			
		}
	}
	
	public static void imprimirArray(int [] array) {
		
		System.out.print("{");
		for (int i = 0;i<array.length;i++) {
					
			System.out.print(array[i]);
			
			if(i<array.length-1)
				System.out.print(", ");
			
		}
		System.out.print("}");
	}
	
	public static void ordenaArrayIntercambio(int [] numeros) {
		
		for (int columna = 0; columna < numeros.length-1; columna++) {
			for (int elemento = columna+1; elemento < numeros.length; elemento++) {
				
				if(numeros[columna]>numeros[elemento]) {
					int aux = numeros[columna];
					numeros[columna]=numeros[elemento];
					numeros[elemento]=aux;
				}
				
			}
			
		}
	}

}