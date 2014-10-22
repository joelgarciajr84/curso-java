
public class Conta {
	
	int numero;
	String dono;
	double saldo;
	double limite;
	double salario;
	Cliente titular = new Cliente();
	
	//Metodo para Sacar
	
	boolean saca(double quantidade){
		
		if(this.saldo < quantidade){
			return false;
		}else{
			
			this.saldo = this.saldo - quantidade;
			
			double novoSaldo = this.saldo - quantidade;
			
			this.saldo = novoSaldo;
			return true;
		}
	
	
	}
	
	//Metodo para Depositar
	
	void deposita(double quantidade){
		
		this.saldo += quantidade;
	}
	

}
