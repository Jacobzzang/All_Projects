package _20210816;

public class Bird extends Animal{
	
	public void takeoff() {
		System.out.println("�̷�");
	}
	public void fly() {
		System.out.println("����");
	}
	@Override
	public void run() {
		System.out.println("�ַ� ���ƴٴѴ�.");
		super.run();
	}
	@Override
	public void eat() {
		System.out.println("������ �Դ´�");
		super.eat();
	}
	public void land() {
		System.out.println("����");
	}
	public void layEggs() {
		System.out.println("���� ����");
	}
}
