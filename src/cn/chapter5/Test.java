package cn.chapter5;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�ϸ�����(y/n)");
		String answer=input.next();
		while(!answer.equals("y")){
			System.out.println("�����Ķ�");
			System.out.println("�����ϻ�");
			System.out.println("�ϸ�����(y/n)");
			answer=input.next();
		}
		System.out.println("���");
	}

}
