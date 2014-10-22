
public class Programa {

	public static void main (String args[]){
		
		//Criando a conta
		
		Conta minhaConta;
		
		minhaConta = new Conta();
		
		//Alterando valores
		
		minhaConta.dono = "Joel";
		minhaConta.saldo = 2000.00;
		
		System.out.println("Saldo Atual R$ " + minhaConta.saldo);
		
		//Invocacao do metodo de Saque
		
		minhaConta.saca(300);
		
		System.out.println("Saldo apos o saque " + minhaConta.saldo);
		
		//Invocacao do metodo de Deposito
		
		minhaConta.deposita(450);
		
		System.out.println("Saldo apos o Deposito " + minhaConta.saldo);
	}
}
