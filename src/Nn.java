

import java.util.Scanner;

public class Nn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1、登录\n2、注销");
		System.out.println("选择：");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("用户名：");
			String name = input.next();
			System.out.println("密码：");
			String password = input.next();
			int num = (int) (Math.random() * (9999 - 1000) + 1000);
			System.out.println("验证码：" + num);
			int yzm = input.nextInt();

			if (name.equals("zs") && password.equals("123") && yzm==num) {
				System.out.println("登录成功");
				System.out.println("1、客户信息管理");
				System.out.println("2.购物结算");
				System.out.println("选择：");
				choice = input.nextInt();
				switch (choice) {
				case 1:
					
					break;

				default:
					break;
				}
				
			} else {
				System.out.println("登录失败");
			}

			break;
		case 2:
			System.out.println("谢谢您的使用！");
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	}
}
