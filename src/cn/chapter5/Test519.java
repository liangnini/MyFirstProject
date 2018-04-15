package cn.chapter5;

import java.util.Scanner;

public class Test519 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String day = "";

		do {
			System.out.print("请输入数字1-7（输入0结束：）");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			if (num == 0) {
				System.out.println("程序结束！");

			} else {
				switch (num) {

				case 1:
					day = " MON";
					break;
				case 2:
					day = " TUE";
					break;
				case 3:
					day = "WED";
					break;
				case 4:
					day = "THU";
					break;
				case 5:
					day = "FRI";
					break;
				case 6:
					day = "SAT";
					break;
				case 7:
					day = "SUN";
					break;
				default:
					System.out.print("输入错误，请重新输入：");
					break;
				}
				System.out.println("今天是 " + day);
			}
		} while (num != 0);

	}
}
