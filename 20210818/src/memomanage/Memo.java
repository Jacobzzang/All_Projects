package memomanage;

//
//@author dbale
//�޸� �ϳ��� ����

public class Memo {

	//�޸� ��� ��ȸ �����ϴ� Ŭ������ �����
	
	private int no;
	private String date;
	private String content;
	
	public Memo(int no, String date, String content) {
		super();
		this.no = no;
		this.date = date;
		this.content = content;
	}

	public Memo(String date, String content) {
		super();
		this.date = date;
		this.content = content;
	}

	public Memo(String content) {
		//���ó�¥�� ��Ʈ������ ��ȯ
		String date = "";
		this.date = date;
		this.content = content;
	}
	//setter/getter
	public Memo() {
		super();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	//toString
	@Override
	public String toString() {
		return "Memo [no=" + no + ", date=" + date + ", content=" + content + "]";
	}
	
	//equals (��¥��)
//	@Override
//	public boolean equals(Object obj) {
//		return super.equals(obj);
//		
//	}
//	
	@Override
	public boolean equals(Object obj) {
		Memo target = (Memo)obj;
		
		return this.no == target.no && this.date.equals(target.date);
		
	}

	@Override
	public int hashCode() {
		return no+date.hashCode();
	}
	
	
	
	
//	
	
	//������ ( 3ro, date/content �ʱ�ȭ, content�ʱ�ȭ, �⺻������)
	
	
	
	
	
	//toString (�����ε�
	
	//equals
}
