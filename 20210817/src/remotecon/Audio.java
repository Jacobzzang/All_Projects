package remotecon;

public class Audio 
	implements RemoteControl {
	private int volume;

	@Override
	public void turnon() {
		System.out.println("����� �Ҵ�");
	}

	@Override
	public void turnoff() {
		System.out.println("����� ����");
	}

	@Override
	public void setvolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("����� ���� : " + this.volume);
	}
	
	
}
