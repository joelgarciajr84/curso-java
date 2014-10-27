//Instacia de concorrencia
public class TestaConcorrencia {
	
	public static void main(String[] args){
		
		// 1 Thread
		
		Concorrencia c1 = new Concorrencia();
		c1.setid(1);
		
		Thread t1 = new Thread(c1);
		t1.start();
		
		//2 Thread
		
		Concorrencia c2 = new Concorrencia();
		
		c2.setid(2);
		
		Thread t2 = new Thread(c2);
		
		t2.start();
		
	
	}

}
