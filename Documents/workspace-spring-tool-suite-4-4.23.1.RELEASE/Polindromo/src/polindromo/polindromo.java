package polindromo;

public class polindromo {
	
	public static void main(String[] args) {
		
		String palabra = "Roma";
		
		System.out.println(palabra);
		for (int i = palabra.toCharArray().length -1; i >= 0; i--) {
			
			System.out.print(palabra.toCharArray()[i]);
			
		}
	}

}
