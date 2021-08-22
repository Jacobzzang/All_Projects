package remotecon;

public class Television 
	implements RemoteControl {
	int volume;
	
	@Override
	public void turnon() {
		System.out.println("TV �Ҵ�");
	}

	@Override
	public void turnoff() {
		System.out.println("TV ����");
		
	}

	@Override
	public void setvolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV ���� : " + this.volume);
	}

	
}
