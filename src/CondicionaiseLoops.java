
public class CondicionaiseLoops {
	
	public static void main(String[] args){
		
// if else		
		int idade = 25;
		
		if (idade >= 18){
			
			System.out.println("Entrada Permitida");
			
		}else{
			
			System.out.println("Entrada Proibida");
		}
		
// Expressoes Booleanas
		
	boolean VotanoPT = true;
	
	if (!VotanoPT  && idade >= 16){
		
		System.out.println("Parabens vc escolheu corretamente");
	}else{
		
		System.out.println("Nao autorizado ou votou errado");
	}
	
	
		
	}

}
