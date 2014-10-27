//Implementacao de concorrencia - Threads
public class Concorrencia implements Runnable {

	private int id;
	
	//Gets e Sets
	public int getid(){
		
		return this.id;
	}
	
	public int setid(int id){
		
		this.id = id;
		
		return this.id;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i <10000; i++){
			
			System.out.println("Programa " + id + " valor: " + i);
		}
		
	}
	
}
