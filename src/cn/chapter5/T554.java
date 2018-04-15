package cn.chapter5;

import java.util.Scanner;

public class T554 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用MyShopping管理系统\n");
		System.out.println("*******************************");
		System.out.println("1.客户信息管理");
		System.out.println("2.购物结算");
		System.out.println("3.真情回馈");
		System.out.println("4.注销");
		System.out.println("*******************************\n");

		Scanner input = new Scanner(System.in);
		boolean isRight = true;
		do {
			System.out.println("请选择输入数字：");
			int x = 0;
			if (input.hasNextInt()) {
				x = input.nextInt();
			
			} else {
				
				System.out.println("输入错误，请重新输入数字：");
				input.nextLine();
				x = input.nextInt();

			}
			switch (x) {
			case 1:
				isRight = true;
				System.out.println("执行客户信息管理");
				break;
			case 2:
				isRight = true;
				System.out.println("执行购物结算");
				break;
			case 3:
				isRight = true;
				System.out.println("执行真情回馈");
				break;
			case 4:
				isRight = true;
				System.out.println("执行注销");
				break;
			default:
				System.out.println("----------您输入的数字 已超出 范围，请重新输入！");
				isRight=false;
				break;
			}
		} while (!isRight);
		System.out.println("\n\n程序结束！");
	}

}
