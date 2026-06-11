package prefijo;

import java.util.ArrayList;
import java.util.List;

public class PrefijoMasLargo {
	
	public static void main(String []args) {
		String [] listBuscador = {"reflower","flow","flight"};
		System.out.println(longestCommonPrefix(listBuscador));
		
	}
	
	public static String longestCommonPrefix(String[] strs) {
	        List<String> listaPrefijos = getListPefix(strs[0]);
	        List<String> listPrefijosEncontrados = searchPrefix(listaPrefijos, strs);
	        listPrefijosEncontrados = filterPrefixByPosition(listPrefijosEncontrados, strs);
	        String prefix = "";
	        int mayor = 0;
	        for (String prefixIterado : listPrefijosEncontrados) {
				if(prefixIterado.length() > mayor) {
					mayor = prefixIterado.length();
					prefix = prefixIterado;
				}
			}
	        
	        
			return prefix;
	    }

	private static List<String> filterPrefixByPosition(List<String> listPrefijosEncontrados, String[] strs) {
		List<String> listPrefijosEncontradosCopy = new ArrayList<>(listPrefijosEncontrados);
		int coincidencia = 0;
		int index = 0;
		
		for(String item : listPrefijosEncontradosCopy) {
			int indexOf = strs[0].indexOf(item);
			for (int i = 0; i < strs.length; i++) {
				System.out.println(strs[i].indexOf(item));
				
				if(indexOf == strs[i].indexOf(item)) coincidencia++;
				
			}
			
			if (coincidencia != strs.length) {
				listPrefijosEncontrados.remove(index);
				coincidencia = 0;
			}
		}
		return listPrefijosEncontrados;
	}

	private static List<String> searchPrefix(List<String> listaPrefijos, String[] strs) {
		List<String> listaPrefijosEncontrados = new ArrayList<>();
        for (String prefix : listaPrefijos) {
        	int countPrefix = 0;
			for (int i = 0; i < strs.length; i++) {
				if(strs[i].contains(prefix)) {
					countPrefix++;
				}
			}
			
			if(countPrefix == strs.length) {
				listaPrefijosEncontrados.add(prefix);
			}
		}
        
        return listaPrefijosEncontrados;
	}

	private static List<String> getListPefix(String palabra) {
		int index = 0;
		List<String> listaPrefijos = new ArrayList<>();
		
		for (int i = 0; i < palabra.toCharArray().length; i++) {
			listaPrefijos.add(String.valueOf(palabra.toCharArray()[i]));
			index++;
			for (int j = i+1; j < palabra.toCharArray().length; j++) {
				listaPrefijos.add(listaPrefijos.get(index-1).concat(String.valueOf(palabra.toCharArray()[j])));
				index++;
			}
		}
		return listaPrefijos;
	}

}
