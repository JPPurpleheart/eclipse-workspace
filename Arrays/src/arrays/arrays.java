package arrays;
import java.util.Scanner;

public class arrays {

	private static Scanner teclado;
	private static int [] enteros;
	private static int elementos;

	//private static Scanner sc;
	//private static char[] num;

	//Programa que pide al user n� enteros los n�meros se guardar�n en un array y al terminar se recorre el array y muestra y como m�ximo 10 n�
	public static void main(String[] args) {

        teclado = new Scanner(System.in);
        
        enteros = new int[10];
        elementos = 0;
        do {
        	System.out.println("Introduce un n�mero entero");
        	enteros[elementos] = teclado.nextInt();
        	elementos ++;
    	}while (elementos < 10);
        	System.out.println("{");
    	for(int i = 0; i < elementos; i++) {
    		System.out.println(enteros[i]);
    		if(i < elementos - 1) {
    			System.out.println(" , ");
    		}
    	}
        
		//sc = new Scanner(System.in);
		//for (int i = 0; i < 10;) {
			//num = sc.next().toCharArray();
			//i = i++;
		//}
        //System.out.println(num);
	}

}
