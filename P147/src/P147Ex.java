import java.util.Scanner;

public class P147Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("� ���� ����?");
		Scanner myIn = new Scanner(System.in);
		String grade = myIn.nextLine();
		switch(grade)
		{
		case "A" : System.out.println("VVIP ������ ������ �� �ֽ��ϴ�."); break;
		case "B" : System.out.println("VIP ������ ������ �� �ֽ��ϴ�."); break;
		case "C" : System.out.println("��� ȸ�� ������ ������ �� �ֽ��ϴ�."); break;
		case "D" : System.out.println("�Ϲ� ȸ�� ������ ������ �� �ֽ��ϴ�."); break;
		default: System.out.println("������ �����ϴ�.");
		}
		System.out.println("�����մϴ�.");
		
		
//		System.out.println("� ���� ����?");
//		char grade = 'C';
//		if ( grade == 'A')
//		{
//			System.out.println("VVIP");
//		}
//		else if( grade == 'B')
//		{
//			System.out.println("VIP");
//		}
//		else if( grade == 'C')
//		{
//			System.out.println("��� ȸ��");
//		}
//		else if( grade == 'D')
//		{
//			System.out.println("�Ϲ� ȸ��");
//		}
//		else
//		{
//			System.out.println("������ �����ϴ�.");
//		}
//		System.out.println("�����մϴ�.");
	}

}
