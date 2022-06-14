package tutorial.classes;

public class Simsim {

	public void hello(String arg) {
		// TODO: who devide type of parameter
		arg.split("/");

	}

	public void say(Object arg) {
		System.out.println(arg.getClass().getName());
		if (arg instanceof Integer) {
			System.out.println("hii integer");
		}
		if (arg instanceof Double) {
			System.out.println("hii Double");
		}
		if (arg instanceof String) {
			System.out.println("hii String");
		}
	}

	public <T> void bye(T param) {
		// TODO Auto-generated method stub
		System.out.println(param);//. toString();
		param.getClass().getFields();
		param.getClass().getMethods();
//		.invoke();
	}

}
