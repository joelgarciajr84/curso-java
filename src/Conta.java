
public class Conta {
	
	int numero;
	String dono;
	double saldo;
	double limite;
	double salario;
	
	//Metodo para Sacar
	
	void saca(double quantidade){
		
		double novoSaldo = this.saldo - quantidade;
		
		this.saldo = novoSaldo;
	}
	
	//Metodo para Depositar
	
	void deposita(double quantidade){
		
		this.saldo += quantidade;
	}
	

}
