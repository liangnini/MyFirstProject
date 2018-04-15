package cn.chapter5;

import java.util.Scanner;

public class Test518 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数（输入0结束）：");
		int num=input.nextInt();

		int max=num;
		int min=num;
		
		while(num!=0){
			System.out.println("请输入一个整数（输入0结束）：");
			num=input.nextInt();
			if (num != 0) {
				if (num >= max) {
					max = num;

				} else {
					if (num < min) {
						min = num;
					}
				}
			}
		}
		System.out.println("最大值："+max+"\t最小值"+min);
	}

}
