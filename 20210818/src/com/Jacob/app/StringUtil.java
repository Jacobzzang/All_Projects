package com.Jacob.app;

public class StringUtil {
	// ����
	public static String findSex(String ssn) {
		if (ssn == null && ssn.isEmpty()) {
			return null;
		}
		char sex = ssn.charAt(7);
		String result = null;
		switch (sex) {
		case '1':
		case '3':
		case '5':
			result = "��";
			break;
		case '2':
		case '4':
		case '6':
			result = "��";
		}
		return result;
//		return (sex =='1'?"��":"��" );
	}
	
	/**
	 * ���ϰ�ο��� ���ϸ� ����
	 * @param path ���ϰ�θ�
	 * @return ���ϸ�
	 * @author kym
	 * @since jdk1.3
	 */
	public static String findFileName(String path) {
		if (path == null || path.isEmpty()) {
			return null;
		}
		return path.substring(path.lastIndexOf("/")+1);	
		
	}

}
