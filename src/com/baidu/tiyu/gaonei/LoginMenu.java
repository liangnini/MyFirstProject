package com.baidu.tiyu.gaonei;

import java.util.*;
public class LoginMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n\t��ӭʹ���������ع������ϵͳ\n");
		System.out.println("\t\t1.��½ϵͳ\n");
		System.out.println("\t\t2.�˳�\n");
		System.out.println("**********************************\n");
		System.out.println("��ѡ���������֣�");
		Scanner input=new Scanner(System.in);
		if(input.hasNextInt()==true){
			int  num=input.nextInt();
			switch (num) {
			case 1:
				System.out.println("\n\t\t��ӭʹ���������ع������ϵͳ\n");
				System.out.println("*********************************************\n");
				System.out.println("\t\t1.�ͻ���Ϣ����\n");
				System.out.println("\t\t2.�������\n");
				System.out.println("\t\t3.�������\n");
				System.out.println("\t\t4.ע��\n");
				System.out.println("*********************************************\n");
				System.out.println("��ѡ���������֣�");
				break;
			case 2:
				System.out.println("лл����ʹ�ã�");
				break;	
			default:
				System.out.println("�������");
				break;
			}
		}else{
			System.out.println("��������ȷ�����֣�");
		}
	}

}
