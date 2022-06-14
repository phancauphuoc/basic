
public class Mytest {
	
	    int id;
	    String name;
	 
	    // constructor
	    public Mytest(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	 
	    // phương thức displayInformation
	    void displayInformation() {
	        System.out.println(id + " " + name);
	    }
	 
	    public static void main(String args[]) {
	    	Mytest s1 = new Mytest(111, "Viet");
	    	Mytest s2 = new Mytest(222, "Tuts");
	 
	        s1.displayInformation();
	        s2.displayInformation();
	    }
	
}
