package cn.chapter5;

import java.util.Scanner;

public class Test518 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("������һ������������0��������");
		int num=input.nextInt();

		int max=num;
		int min=num;
		
		while(num!=0){
			System.out.println("������һ������������0��������");
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
		System.out.println("���ֵ��"+max+"\t��Сֵ"+min);
	}

}
