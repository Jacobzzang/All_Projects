package remotecon;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//�ҽ��ڵ带 �������� �ʰ� ��ü�� ��ü
		//Television t = new Television();
		//Audio t = new Audio();
		
		RemoteControl t = new Television();//FectoryBean.getBean(args[0]);
		
		t.turnon();
		t.setvolume(5);
		t.turnoff();
		
		
	}

}
