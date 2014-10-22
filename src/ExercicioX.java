
public class ExercicioX {
	
	public static void main(String args[]){
		
		//Imprima todos os numeros de 150 a 300
		
		for(int i = 150; i <= 300; i++){
		
			System.out.println("Numero " + i);
		
		}
		//Imprima a soma de 1 ate 1000
		
		int j = 1;
		
		while (j <= 1000){
			
		j = j +j;
			
				System.out.println(j);
		}
	//Imprima todos os multiplos de 3 entre 1 e 100
		
		for (int x = 3; x <=100; x++){
			
			if(x % 3 == 0){
				
				System.out.println(x + " E um multiplo de 3");
			}
		}
	}

}
