

import java.util.Scanner;

public class Nn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1����¼\n2��ע��");
		System.out.println("ѡ��");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("�û�����");
			String name = input.next();
			System.out.println("���룺");
			String password = input.next();
			int num = (int) (Math.random() * (9999 - 1000) + 1000);
			System.out.println("��֤�룺" + num);
			int yzm = input.nextInt();

			if (name.equals("zs") && password.equals("123") && yzm==num) {
				System.out.println("��¼�ɹ�");
				System.out.println("1���ͻ���Ϣ����");
				System.out.println("2.�������");
				System.out.println("ѡ��");
				choice = input.nextInt();
				switch (choice) {
				case 1:
					
					break;

				default:
					break;
				}
				
			} else {
				System.out.println("��¼ʧ��");
			}

			break;
		case 2:
			System.out.println("лл����ʹ�ã�");
			break;
		default:
			System.out.println("�������");
			break;
		}
	}
}
