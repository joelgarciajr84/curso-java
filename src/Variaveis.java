
public class Variaveis {
	
	public static void main(String[] args){
		
		//Variaveis
		
		int gastosJaneiro = 1500;
		int gastosFevereiro = 23000;
		int gastosMarco =  17000;
		
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		int mediaMensal = gastosTrimestre / 3;
		
		System.out.println("Valor total dos Gastos no Trimestre R$ " + gastosTrimestre +"\n");
		System.out.println("Valor da Media Mensal R$ " + mediaMensal);
	
	}

}
