package co.jacob.chap6.greet;

public class GreetApp {

	public static void main(String[] args) {
		Greet greet = new Greet("�̼���");
		
		greet.printName();
		greet.printGreet();
		
		Greet greet1 = new Greet("������");
		greet1.printGreet();
		
		Greet greet2 = new Greet();
		greet2.printGreet();
	}

}
