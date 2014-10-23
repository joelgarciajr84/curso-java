
public class Funcionario {
	
	//Classe Funcionario
	
	private String nome;
	private String departamento;
	private double salario;
	private String datadeentrada;
	private String rg;
	private double valorbonus = 200;
	
	
	// Construtor
	
	Funcionario (String nome, String departamento, double salario) {
		
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		
		this.salario  = this.salario + valorbonus;
		
		System.out.println("Seja Bem Vindo " + this.nome + "\n");
		
		if(valorbonus > 0 ){
			
			System.out.println("Voce recebeu um bonus de " + valorbonus + "\n");

			
		}


	}
// Gets e Sets
	
//Nome
	
	public String  getNome(){
		
		return this.nome;
	}
	
	public String setNome(String nome){
		
		this.nome = nome;
		
		return this.nome;
	}
	
//Departamento
	
	public String getDepartamento(){
		
		return this.departamento;
	}
	
	public String setDepartamento(String departamento){
		
		this.departamento = departamento;
		
		return this.departamento;
	}
	
// Salario
	public double getSalario(){
		
		return this.salario;
	}
	public double setSalario(double salario){
		
		this.salario = salario;
		
		return this.salario;
	}
	
	// Data de entrada
	public String getDatadeEntrada(){
		
		return this.datadeentrada;
	}
	
	public String getRG(){
		
		return this.rg;
	}
	
	
	//Metodo para calcular o Ganho Anual
	
	public void calculaGanhoAnual (){
		
		System.out.println("Previsao de Ganho Anual: " + this.salario * 12 + "\n");
	}
	//Metodo para exibir os dados

		public void exibeDados(){
			
			System.out.println(
					
					":: Dados do Funcionario ::\n\n" +
					"Nome:" + this.getNome()  + "\n" +
					"Departamento: " + this.getDepartamento() + "\n"+
					"Salario: " + this.getSalario()+ "\n" +
					"Data de Entrada: " + this.getDatadeEntrada() + "\n" +
					"RG: " + this.getDatadeEntrada()
					
					);
		}
}
