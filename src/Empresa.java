public class Empresa {
	
	String nome;
	String cnpj;
	Funcionario[] empregados;
	
	
	void adiciona(Funcionario f){
			
		int tamanho = this.empregados.length;
		this.empregados[tamanho + 1] = f;
		
		}
	void exibeEmpregados(){
		
		for(int x =0; x <= this.empregados.length; x++){
			
			System.out.println("Funcionario na Posicao" + x);
		}
	}
	}

