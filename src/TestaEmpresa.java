public class TestaEmpresa {
	
	public static void main(String[] args){
		
		Empresa empresa = new Empresa();
		
		empresa.empregados = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		f1.salario = 2450;
		
		Funcionario f2 = new Funcionario();
		f2.salario = 1267;
		
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		
		empresa.exibeEmpregados();
	}

}
