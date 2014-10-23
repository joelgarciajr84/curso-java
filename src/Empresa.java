public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] empregados;
	
	
	void adiciona(Funcionario f){
			
		int tamanho = this.empregados.length - 1;
		
		this.empregados[tamanho] = f;
		
		}
	void exibeEmpregados(){
		
		for(int x =0; x <= this.empregados.length; x++){
			
			System.out.println("Funcionario na Posicao" + x);
			System.out.println("Nome do Funcionario" + this.empregados[x].nome);
		}
	}
	}

