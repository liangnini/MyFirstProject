package com.baidu.tiyu.gaonei;

import java.util.*;

public class HuanGou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���������ѽ�");

		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		System.out.println("�Ƿ�μ��Żݻ������");
		System.out.println("1����50Ԫ����2Ԫ�������¿�������1ƿ");
		System.out.println("2.��100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3.��100Ԫ����10Ԫ����5kg���");
		System.out.println("4.��200Ԫ����10Ԫ�ɻ���1���ղ������˹�");
		System.out.println("5����200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ");
		System.out.println("0��������");
		System.out.print("��ѡ��");
		if (input.hasNextInt() == true) {
			int num = input.nextInt();
			switch (num) {
			case 1:
				if (money >= 50) {
					System.out.println("���������ܽ�" + (money + 2));
					System.out.println("�ɹ����������¿�������һƿ");
					break;
				} else {
					System.out.println("���ѽ���");
					break;
				}
			case 2:
				if (money >= 100) {
					System.out.println("���������ܽ�" + (money + 3));
					System.out.println("�ɹ�����:500ml����һƿ");
					break;
				} else {
					System.out.println("���ѽ���");
					break;
				}
			case 3:
				if (money >= 100) {
					System.out.println("���������ܽ�" + (money + 10));
					System.out.println("�ɹ�����:5kg���");
					break;
				} else {
					System.out.println("���ѽ���");
					break;
				}

			case 4:
				if (money >= 200) {
					System.out.println("���������ܽ�" + (money + 10));
					System.out.println("�ɹ�������1���ղ������˹�");
					break;
				} else {
					System.out.println("���ѽ���");
					break;
				}

			case 5:
				if (money >= 200) {
					System.out.println("���������ܽ�" + (money + 20));
					System.out.println("�ɹ�������ŷ����ˬ��ˮһƿ");
					break;
				} else {
					System.out.println("���ѽ���");
					break;
				}
			case 0:
				System.out.println("���������ܽ�" + money);
				System.out.println("������");
				break;
			default:
				System.out.println("�������");
				break;
			}
		} else {
			System.out.println("��������ȷ�����֣�");
		}
	}

}
