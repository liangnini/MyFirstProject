package cn.chapter5;

import java.util.Scanner;

public class T554 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ӭʹ��MyShopping����ϵͳ\n");
		System.out.println("*******************************");
		System.out.println("1.�ͻ���Ϣ����");
		System.out.println("2.�������");
		System.out.println("3.�������");
		System.out.println("4.ע��");
		System.out.println("*******************************\n");

		Scanner input = new Scanner(System.in);
		boolean isRight = true;
		do {
			System.out.println("��ѡ���������֣�");
			int x = 0;
			if (input.hasNextInt()) {
				x = input.nextInt();
			
			} else {
				
				System.out.println("��������������������֣�");
				input.nextLine();
				x = input.nextInt();

			}
			switch (x) {
			case 1:
				isRight = true;
				System.out.println("ִ�пͻ���Ϣ����");
				break;
			case 2:
				isRight = true;
				System.out.println("ִ�й������");
				break;
			case 3:
				isRight = true;
				System.out.println("ִ���������");
				break;
			case 4:
				isRight = true;
				System.out.println("ִ��ע��");
				break;
			default:
				System.out.println("----------����������� �ѳ��� ��Χ�����������룡");
				isRight=false;
				break;
			}
		} while (!isRight);
		System.out.println("\n\n���������");
	}

}
