package polymorphism;

public class Circle extends Shape {
	private int r;

	@Override
	public void draw() {
		System.out.println("���׸���");
		super.draw();
	}
	
}
