public class TestaEmpresa {
	
	public static void main(String[] args){
		
		Empresa empresa = new Empresa();
		
		empresa.empregados = new Funcionario[30];
		
		System.out.println("Array this.empregados tem tamanho " + empresa.empregados.length);
		
		Funcionario f10 = new Funcionario("Ronan da Silva", "Logistica", 1260.89);
		
		//f1.nome = "Funcionario Teste 1";
		//f1.salario = 2450;
		empresa.adiciona(f10);
		
		
	Funcionario f11 = new Funcionario("Jociara Santos", "Saude", 4678.23);
	
	//f2.salario = 1267;
	
	empresa.adiciona(f11);
		
		empresa.exibeEmpregados();
		
	}

}
