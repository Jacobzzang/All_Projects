package co.jacob.chap6.sum;

public class Calc {

	int num1;
	int num2;
	//�μ� �ʱ�ȭ
	public Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	//�հ�
	public int add() {
		return num1+num2;
	}
	//����
	public int sub() {						//return ���� ��ü�� Ÿ���� public �ڿ� ���ش�.
		return num1-num2;					//�ǵ��� ���� ������ ���� void ��� ����.
	}
	//����
	public int mul() {
		return num1*num2;
	}
	//������
	public double div() {
		return (double)num1/num2;
	}
}
