package shape;

public class Circle 
	extends Shape 
	implements Drawable, Movable{
	private int r;
	
	

	@Override
	public void move() {
		System.out.println("�� �̵�");
	}



	@Override
	public void draw() {
		System.out.println("�� �׸���");
	}
	
}
