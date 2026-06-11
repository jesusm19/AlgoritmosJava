package sortedLists;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedLists {
	
	public static void main(String []args) {
		
		int []array1 = {1,2,4};
		int []array2 = {1,3,4};
		int []array3 = mergeTwoLists(array1, array2);
		
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
			
		}
	}
	
	
	public static int [] mergeTwoLists(int [] list1, int[] list2) {
		
		int [] newArray = IntStream.concat(Arrays.stream(list1), Arrays.stream(list2)).toArray();
		
		return sortNumbers(newArray);
        
    }
	
	private static int[] sortNumbers(int [] numeros) {
		for (int i = 0; i<=numeros.length; i++) {
			for(int j = i+1; j< numeros.length; j++) {
				int numeroMenor = numeros[i];
				
				if(numeros[j] < numeroMenor) {
					numeroMenor = numeros[j];
					int auxiliar = numeros[i];
					numeros[i] = numeroMenor;
					numeros[j] = auxiliar;
				}
				
				
				
			}
			
		}
		
		return numeros;
	}  
	

}



