package memomanage;

import java.util.List;

public interface MemoList {
	
	
	// ���
	void input(Memo memo);

	// ����
	void update();

	// ����
	void delete(int no); // ��ȣ����

	void delete(String date); // ��¥����

	void delete(int no, String date); // ��¥����
	// �ܰ���ȸ

	void search(int no); // type�� �̸� �ٸ��� �ߺ����� ��ȣ1�Ǹ� ��ȸ

	void search(String date); // �ش� ��¥�� ������ ��� ��ȸ

	void searchContent(String content); // type�� String ���� ���Ƽ�
										// searchContent�� �̸��ٲ���
										// ����˻�(�ش�ܾ ���ԵǾ� ������)

	// ��ü��ȸ
	void print();
	List<Memo> selectAll();

}
