
public class Array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �л� 3���� ����(����)�� "�迭"�� �̿��ؼ�, �׷�ȭ�� �� ����ϴ� ��.
		//1. �迭 ���� ����
		//2. �迭�� ũ�� ����
		//3. �迭�� �����͸� ����
		//4. �迭�� ����Ǿ��ִ� �����͸� ����(����)
		int[] scores = { 83, 90, 87, 100, 101, 224, 332 };
		
		for ( int k = 0; k < scores.length  ; k++)
		{
			System.out.print(k + "�� ���� : " + scores[k] + ", ");
		}
		System.out.println();
//		System.out.println("scores[0] : " + scores[0]);
//		System.out.println("scores[1] : " + scores[1]);
//		System.out.println("scores[2] : " + scores[2]);
//		
		int sum = 0;
		for(int i=0; i<3; i++)
		{
			sum += scores[i];
		}
		System.out.println("���� : " + sum);
		double avg = (double) sum / scores.length ;
		System.out.println("��� : " + avg);
		
	}

}
