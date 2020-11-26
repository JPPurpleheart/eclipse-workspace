package echo;

public class echo{

	public static void main(String [] args) {
		for (int i = 0; i < args.length; i++) {
			args[i] = "hacker";
		}
		
		for (String string : args) {
			System.out.println(string);
		}
		
		// System.out.println(2/0);
		
		//for (String cad : args) {
			//System.out.println(cad);
		}
	}