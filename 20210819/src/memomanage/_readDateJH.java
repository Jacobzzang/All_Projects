package memomanage;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class _readDateJH {
   
   static Scanner sc = new Scanner(System.in);
   
   public static int readInt() {
      int result = 0;
      while(true) {
         try {
            String temp = sc.next();
            result = Integer.parseInt(temp);
            break;
         }catch (Exception e) {
            System.out.println("���� ������ �ƴմϴ�.");
         }
      }
      return result;
   }
   //�����Է�
   public static int readInt(String prompt) {
      System.out.println(prompt);
      System.out.println(">");
      return readInt();
   }
   
   
   //��¥ �Է� 
   public static String readDate() {
      String result = "";
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      
      do {
         try {
            result = sc.next();
            sdf.parse(result.trim());
            //���õ����� ������ �̿��ؼ� ����Ʈ �Ľ��ϵ��� 
            break;
         }catch (Exception e) {
            System.out.println("��¥ ������ �ƴմϴ�.yyyy-MM-dd");
         }
      }while (true);
      return result;
   }
   
   public static String readDate(String prompt) {
      System.out.println(prompt);
      System.out.println(">");
      return readDate();
   }

}