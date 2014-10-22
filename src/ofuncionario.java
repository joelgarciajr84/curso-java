
public class ofuncionario {

	public static void main(String[] args){
		
		//Instancia do Funcionario f1
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Jose da Silva";
		f1.departamento = "Vendas";
		f1.salario = 2300.56;
		f1.datadeentrada = "12/03/2001";
		f1.rg = "MG 342.222-44";
		
		//Impressao dos Dados do f1
		
		f1.exibeDados();
		
		f1.recebeAumento(300);
		
		System.out.println("Salario apos o aumento: " + f1.salario );
		
		f1.calculaGanhoAnual();
		
	//Instacia do Funcionario 2
	
		Funcionario f2 = new Funcionario();
		
		f2.nome = "Janynne Gomes";
		f2.departamento = "Administracao";
		f2.salario = 2400.40;
		f2.datadeentrada = "23/04/2008";
		f2.rg = "MG 45.678.90";
		
		//Imprime os dados do f2
		
		f2.exibeDados();
		
		f2.recebeAumento(200);
		
		System.out.println("Salario apos o aumento " + f2.salario);
		
		f2.calculaGanhoAnual();
	
	if(f1 == f2){
		
		System.out.println("Funcionario Duplicado");
	}else{
		System.out.println("Funcionarios Nao Duplicados");
	}
	
	
	}
}
