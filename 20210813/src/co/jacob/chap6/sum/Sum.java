package co.jacob.chap6.sum;
//�� ���� ���� ���
//data : int�� �ΰ�
//��� : �μ������� ���
public class Sum {
int num1 = 10;
int num2 = 20;


	public int add() {
		int temp;
		temp = num1+num2;
		return temp;
	}

	public void print() {
		System.out.println(num1 + num2);
		return;   // return;�� ���� �����ȰŶ� �Ƚᵵ�ȴ�.
	}
}
