import java.util.Arrays;
import java.util.LinkedList;

public class Problema {
	
	public static void main(String[] args) {

		//Creo la lista de números
		LinkedList<Integer> numeros = new LinkedList<Integer>(Arrays.asList(1,1,1,3,4,3,3,3,4,5,3,1,3)); 
				
		//Busco el más repetido
		Integer result = mayorRepetido(numeros);
		
		System.out.println("Mayor Repetido: "+ result);
		
	}


	private static Integer mayorRepetido(LinkedList<Integer> numeros) {

		//En esta variable me voy quedando con el mÃ¡s repetido
		Integer repetido=0;
		//En esta variable me quedo con la cantidad de repeticiones
		Integer repeticiones=0;
		Hashtable<Integer, Integer> ht= new Hashtable<Integer, Integer>();
		for (Integer num : numeros) {
			int count=0;
			if(!ht.containsKey(num)){
				count=0;
			}else{
				count=ht.get(num);
			}
			count++;
			ht.put(num, count);
			if (count>repeticiones) {
				repeticiones=count;
				repetido=num;
			}
		}
		//Devuelvo el mÃ¡s repetido
		return repetido;
	}
		
}
