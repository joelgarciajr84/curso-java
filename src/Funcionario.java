
public class Funcionario {
	
	//Classe Funcionario
	
	String nome;
	String departamento;
	double salario;
	String datadeentrada;
	String rg;
	
	
	//Metodo para receber aumento
	
	double recebeAumento(double valoraumento){
		
		this.salario = this.salario + valoraumento;
		
		return this.salario;
	}
	
	//Metodo para calcular o Ganho Anual
	
	void calculaGanhoAnual (){
		
		System.out.println("Previsao de Ganho Anual: " + this.salario * 12 + "\n");
	}
	

	//Metodo para exibir os dados

		void exibeDados(){
			
			System.out.println(
					
					":: Dados do Funcionario ::\n\n" +
					"Nome:" + this.nome  + "\n" +
					"Departamento: " + this.departamento + "\n"+
					"Salario: " + this.salario + "\n" +
					"Data de Entrada: " + this.datadeentrada + "\n" +
					"RG: " + this.rg
					
					);
		}
}