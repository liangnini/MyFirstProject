package cn.chapter7.book1;

import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String name=input.next();
		switch (name) {
		case "hzh":
			System.out.print("ming"+name);
			break;

		default:
			break;
		}
	}

}
