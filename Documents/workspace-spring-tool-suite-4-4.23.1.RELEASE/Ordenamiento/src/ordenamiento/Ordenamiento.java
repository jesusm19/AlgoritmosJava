package ordenamiento;


public class Ordenamiento {
	
	public static void main(String[] args) {
		int [] numeros = {1,2,5,3,3,6,3,6,7,2,4,8,8,4,2,3,4,54,63,46,34,12,23,3,1,3,2,3,4,3,5,2,3,3,4,5,6,7,8,9,0};
		for (int numero : ordenarNumeros(numeros)) {
			System.out.println(numero);
		}
		
		
		String letras = "jkhsdlfiuyymxnsdyoiwuysdz";
		for (char letra : ordenarLetras(letras.toCharArray())) {
			System.out.println(letra);
		}
		 
		
	}
	
	private static int[] ordenarNumeros(int [] numeros) {
		for (int i = 0; i<=numeros.length; i++) {
			for(int j = i+1; j< numeros.length; j++) {
				int numeroMayor = numeros[i];
				
				if(numeros[j] > numeroMayor) {
					numeroMayor = numeros[j];
					int auxiliar = numeros[i];
					numeros[i] = numeroMayor;
					numeros[j] = auxiliar;
				}
				
				
				
			}
			
		}
		
		return numeros;
	}
	
	private static char[] ordenarLetras(char [] letras) {
		for (int i = 0; i<=letras.length; i++) {
			for(int j = i+1; j< letras.length; j++) {
				char numeroMayor = letras[i];
				
				if(letras[j] > numeroMayor) {
					numeroMayor = letras[j];
					char auxiliar = letras[i];
					letras[i] = numeroMayor;
					letras[j] = auxiliar;
				}
				
				
				
			}
			
		}
		
		return letras;
	}

}
