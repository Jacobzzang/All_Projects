
public class P173_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����Ͱ� ������ �������(Heap������ ���)�� "�ּ�(point)"�� �����ϴ�, ������ ������.
		//�����͸� �����ϴ� ����� ��� �ߴ��Ŀ� ����, ����Ǵ� �ּҰ� ���� ���� �ٸ� ���� �ִ�.
		//1. ���ͷ� ������� ������ ���� ��, ���� ---> �ּҰ� ����(��, �ּҸ� ����)
		//2. �� ���� ������� �����͸� ���� ��, ���� ---> ������ ���� �� ����, ������ ������ �����ǹǷ� �ּҰ� �ٸ�.
		
		//���ͷ� ��� ( Hard coding)���� ������ ������.
		
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		
		// ������ ���� v1, v2�� ������ ��.
		
		if(strVar1 == strVar2 ) 	// ������ ������ ����ִ� "�ּ�"�� ��.
		{
			System.out.println("strVar1�� strVar2�� ������ ����");
		}
		else
			{
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
			}
		
		// ������ ������ ��� �ִ� "�ּ�"�� ã�ư���, "������"��ü�� ��.
		
		if(strVar1.equals(strVar2))
		{
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		//new�� �̿��Ͽ�, �ڵ� ���縦 �ϴ� ������ ���� ������ ������.
		
		String strVar3 = new String("�Ź�ö");
		String strVar4 = new String("�Ź�ö");
		
		if(strVar3 == strVar4)                //.equals�� ��ü ������ ���� ���ϸ� ���ٰ� ����.
		{
			System.out.println("strVar3�� strVar4�� ������ ����");
		}
		else
		{
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
	}

}
