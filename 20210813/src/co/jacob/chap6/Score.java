package co.jacob.chap6;

/*��ü����
1.���� ���α׷� : ������� ó���� ���α׷�
	data :	int[]   <-- �ʵ�
	���	 :	��ü���  <-- �޼���(�Լ�)
			�հ�
			�ִ�
*/
//ǥ��� :�ڹ٤� ī�����̽� ex)KorScore,
//		����Ŭ�� ������ũ���̽� ex)Kor_score
//2. ���赵�� �ۼ�
public class Score {
	int[] kor = new int[] { 100,80,70};
	
	public void print() {
		for(int temp : kor) {
			System.out.println(temp);
		}
	}
	
	public void total() {
		int sum = 0;
		for(int temp : kor) {
			sum += temp;
		}
		System.out.println(sum);
	}
		
			
	
	public void max() {
		int m=0;
		for(int temp : kor) {
		}
		System.out.println(m);
	}
}
