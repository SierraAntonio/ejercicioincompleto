package main;

public class arreglo {
	public static void main(String[] args) {
		
		
	int array1[];{
		
	
	array1 = new int[16]; 
	 
	
	array1[10] = 5;
 array1[2]=3;
	
	
	for  (int x=1; x<array1.length; x++) {
		  System.out.println(array1[x]);
		  
	}
	System.out.println("El valor de la posicion en el arreglo es " + array1[10]);
	
	
	

	String array2[]; {

		array2 =new String[20];
		
		array2[1] = "francisco";
		array2[7] = "rodolfo";
		System.out.println("\n los valores del arreglo 2 son " );
		for  (int x2=0; x2<array2.length; x2++) {
			 System.out.println(array2[x2]);
			 
		}
		for  (int x2=0; x2<array2.length; x2++) {
			
			 
		}System.out.println("El valor de la posicion 1 en el arreglo es " + array2[1]);
		
		
	}
	int array3[];{
		
	array3 = new int[100]; 
	System.out.println("\n los valores del arreglo 3 son " );

	for  (int x3=0; x3<array3.length; x3++) {
		 System.out.println(array3[x3]);
		 
	}System.out.println("El valor de la posicion 40 en el arreglo es " + array3[40]);
	
	}
}
	}
	
}
