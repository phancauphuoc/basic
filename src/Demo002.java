
public abstract class Demo002 {
	 //returnType methodName (parameters) { process }
	// method define, implement
	// define  : returnType methodName (parameters);
	// implement : Make { body }
	
	
	//not implement yet
	abstract void todo();  // => define
	void some() { // => implement
		//body
		getValue();
		getValue('A'/*argument*/);
	}
	
	int getValue() {
		//process...
		return 0;
	}
	
	int getValue(char letter /*parameter*/) {
		//process...
		return 0;
	}
	
	
	
}
