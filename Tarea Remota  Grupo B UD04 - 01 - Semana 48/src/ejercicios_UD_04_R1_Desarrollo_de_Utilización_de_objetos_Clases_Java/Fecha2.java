/**
 * 
 */
package ejercicios_UD_04_R1_Desarrollo_de_Utilización_de_objetos_Clases_Java;
import java.util.Scanner;
/**
 * @author josep
 *
 */
public class Fecha2 {

	private static int dia;
	private static int mes;
	private static int anyo;
	private static Scanner sn;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sn = new Scanner(System.in);
		dia = 1;
		mes = 1;
		anyo = 1;
		System.out.println("Introduce el dia, el mes y el anyo");
		Fecha2.ModificarFecha(dia, mes, anyo);
		
	}
	
	public static void ModificarFecha(Integer dia, Integer mes, Integer anyo) {
		Fecha2.ModificarDia(dia);
		Fecha2.ModificarMes(mes);
		Fecha2.ModificarAnyo(anyo);
		Fecha2.ComprobarFecha(dia, mes);
	}

	public static Integer ModificarDia(Integer dia) {
		dia = sn.nextInt();
		Fecha2.ComprobarFecha(dia, mes);
		return null;
		
	}
	
	public static Integer ModificarMes(Integer mes) {
		mes = sn.nextInt();
		Fecha2.ComprobarFecha(dia, mes);
		return null;
	}
	
	public static Integer ModificarAnyo(Integer anyo) {
		anyo = sn.nextInt();
		return null;
	}
	
	public static Integer DevolverDia(Integer dia) {
		dia = Fecha2.toString(dia, 0, 0);
		return null;
		
	}
	
	public static Integer DevolverMes(Integer mes) {
		mes = Fecha2.toString(0, mes, 0);
		return null;
		
	}
	
	public static Integer DevolverAnyo(Integer anyo) {
		anyo = Fecha2.toString(0, 0, anyo);
		return null;
		
	}
	
	public static Integer toString(Integer dia, Integer mes, Integer anyo) {
		dia = Fecha2.ModificarDia(Integer.valueOf(dia));
		mes = Fecha2.ModificarMes(Integer.valueOf(mes));
		anyo = Fecha2.ModificarAnyo(Integer.valueOf(anyo));
		return null;
		
	}
	
	private static void ComprobarFecha(Integer dia, Integer mes) {
		dia = Fecha2.ModificarDia(dia);
		mes = Fecha2.ModificarMes(mes);
		try {
			if(1 >= dia && dia <= 31 && 1 >= mes && mes <= 12){
				System.out.println(dia + "/" + mes + "/" + anyo);
			}
		} finally {
			System.out.println("Introduce una fecha correcta");
			dia = Fecha2.ModificarDia(dia);
			mes = Fecha2.ModificarMes(mes);
		}
	}

}
