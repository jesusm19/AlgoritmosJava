package dulces;

import java.util.ArrayList;
import java.util.List;

public class DulcesGratis {
	
	public static void main(String[] args) {
		int [] numeros = {1,2,5,3,3,6,3,6,7,2,4,8,8,4,2,3,4,54,63,46,34,12,23,3,1,3,2,3,4,3,5,2,3,3,4,5,6,7,8,9,0};
		int[] dulces = ordenarNumeros(numeros);
		for (int dulce : dulces) {
			System.out.print(dulce + " ");
			
		}
		System.out.println();
		
		for (Integer total : obtenerTotalDulces(dulces)) {
			System.out.print(total + " ");
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
	
	private static List<Integer> obtenerTotalDulces(int [] dulces) {
		List<Integer> totalDulces = new ArrayList<>();
		int contadorDulces = 0;
		int suma = 0;
		for (int i = 0; i < dulces.length; i++) {
			suma += dulces[i];
			contadorDulces++;
			
			if(contadorDulces == 2) {
				totalDulces.add(suma);
				suma = 0;
			}
			
			if(contadorDulces == 3) {
				suma = 0;
				contadorDulces = 0;
				continue;
			}
			
		}
		
		return totalDulces;
	}

}
