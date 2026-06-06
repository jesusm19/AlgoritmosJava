package fibonacci;

public class Fibonacci {

	public static void main(String [] args) {
		
		int inicio = 0;
		int fin =  1;
		
		while(fin < 100) {
			
			System.out.print(inicio + " ");
			int aux = inicio;
			inicio += fin;
			fin = aux;
			
		}
		
		
	}
	
}
