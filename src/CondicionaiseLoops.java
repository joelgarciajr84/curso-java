
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
	
// While
	
	int carros = 4;
	
	while (carros <= 10){
		
		System.out.println(carros);
		
		++carros;
	}
	
//for

	for(int PrecoiPhone = 1000; PrecoiPhone <= 2000; PrecoiPhone = PrecoiPhone + 500){
		
		if (PrecoiPhone <= 1999){
		System.out.println("O Preco do iPhone esta R$ " + PrecoiPhone + " Ainda nao posso comprar pra ostentar");
		}else{
			
			System.out.println("O Preco do iPhone esta R$ " + PrecoiPhone + " Agora posso ostentar");
		}
		
		
	}
	
		
	}

}
