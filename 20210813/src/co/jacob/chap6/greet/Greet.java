package co.jacob.chap6.greet;
/* �̸��� �����ϰ� ����ϴ� ���α׷�
 * data : �̸�
 * ��� : �̸� ���
 * 		�λ縻 ���
 */
public class Greet {
	String name = "ȫ�浿";
	
	//�������� ���� : �ʵ带 �ʱ�ȭ
	//������ : ��ü �����ɶ� ȣ��Ǵ� Ư���� �뵵�� �޼���
	//������ �ϳ��������� �����Ϸ��� �⺻�����ڸ� ���� 
	//������ �ϳ��� �����ϸ� �⺻�����ڸ� ������ ���� �׷��� 
	//�μ��� �ִ� �����ڸ� ���������� �ߴٸ� �μ������� �⺻�����ڸ� ������ ���� �����������
	
	public Greet(String guestname) {
		name = guestname;
	}
	public Greet() {
	}
	
	public void printName() {
		System.out.println(name);
	}
	public void printGreet() {
		System.out.println("�氡!!" + name);
	}
}


