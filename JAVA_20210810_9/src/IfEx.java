
public class IfEx {

	public static void main(String[] args) {
		//������ ����
		//����� ������ ���� 90�̻��̸� A
		//80�̻��̸� B
		//70�̻��̸� C
		//70�̸��̸� D
//		int score = 75;
//		
//		if(score>=90) {
//			System.out.println("������ 100~90�Դϴ�.");
//			System.out.println("����� A�Դϴ�.");
//		} else if(score>=80) {
//			System.out.println("������ 80~89�Դϴ�.");
//			System.out.println("����� B�Դϴ�.");
//		} else if(score>=70) {
//			System.out.println("������ 70~79�Դϴ�.");
//			System.out.println("����� C�Դϴ�.");
//		} else {
//			System.out.println("������ 70 �̸��Դϴ�.");
//			System.out.println("����� D�Դϴ�."); 
//		}
		int score = 78;

		char yourGrade = 0;

		if ( (score >= 90 ) && ( score <= 100 ) )

		{

		yourGrade = 'A';

		}

		else if (( score >= 80 ) && ( score < 90 ) )

		{

		yourGrade = 'B';

		}

		else if (score >= 70 )

		{

		yourGrade = 'C';

		}

		else if (score < 70 )

		{

		yourGrade = 'D';

		}

		System.out.println( "����� �������" + yourGrade);

	}

}
