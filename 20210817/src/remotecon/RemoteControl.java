package remotecon;
//���ո����� -> TV, Audio

//����ǥ��,��ü

public interface RemoteControl {
	
	
	int MAX_VOLUME = 10; // �տ� public static final�� �پ��ִ�
	void turnon();		//public abstract
	void turnoff();
	void setvolume(int volume);
}
