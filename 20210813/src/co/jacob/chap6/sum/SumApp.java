package co.jacob.chap6.sum;

public class SumApp {

	public static void main(String[] args) {
		//Ŭ�����̸� �����̸� = ��ü
		//�������� Sum 
		Sum sum = new Sum();
		//���� �̸�.print()
		sum.print();
		
		
		int hap = sum.add();
		System.out.println(hap);
		
		System.out.println(sum.add());
	}

}
