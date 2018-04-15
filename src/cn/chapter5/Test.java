package cn.chapter5;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("合格了吗？(y/n)");
		String answer=input.next();
		while(!answer.equals("y")){
			System.out.println("上午阅读");
			System.out.println("下午上机");
			System.out.println("合格了吗？(y/n)");
			answer=input.next();
		}
		System.out.println("完成");
	}

}
