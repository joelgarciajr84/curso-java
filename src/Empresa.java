public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] empregados;
	
	
	void adiciona(Funcionario f){

		int elementos = 0; //this.empregados.length;
			
			
				this.empregados[elementos] = f;
				
				elementos++;
			
		}
	
		
	void exibeEmpregados(){
		
		for(int x =0; x <= this.empregados.length; x++){
			
			System.out.println("Funcionario na Posicao" + x);
			System.out.println("Nome do Funcionario" + this.empregados[x].getNome());
		}
	}
	}

