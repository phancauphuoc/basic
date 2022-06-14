package tutorial;



public class Left extends Robo{	
	private int min = 0;
	private int max = 1000;
	private int call;
	private int answer;
	
	public int call() {
		call = (max+min)/2;
		return call;
	}
	public void ready() {
		answer = 123;
	}
	public void listen(int v) {
		if( v == 1 ) {
			// UP
//			max = call;
			min = call;
		}
		if( v == 2 ) {
			// DOWN
			max = call;
//			min = call;
		}
		
	}
	
}
