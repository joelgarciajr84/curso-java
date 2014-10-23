public class TestaEmpresa {
	
	public static void main(String[] args){
		
		Empresa empresa = new Empresa();
		
		empresa.empregados = new Funcionario[10];
		
		System.out.println("Array this.empregados tem tamanho" + empresa.empregados.length);
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Funcionario Teste 1";
		f1.salario = 2450;
		empresa.adiciona(f1);
		
		
	Funcionario f2 = new Funcionario();
	f2.salario = 1267;
	empresa.adiciona(f2);
		
		

		
		empresa.exibeEmpregados();
		
	}

}
