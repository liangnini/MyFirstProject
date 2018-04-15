package cn.chapter6.book1;

import java.util.Scanner;



public class Test69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("请输入用户名:");
			String name=in.next();
			System.out.print("请输入密码：");
			int password=in.nextInt();
			if(name.equals("jim")&&password==123){
			System.out.println("欢迎登陆MyShopping系统！");
				break;
			}else{
				
				System.out.println("输入错误，您还有"+(2-i)+"机会");
				if(i==2){
					System.out.println("\n对不起，您3次均输入错误！");
					
				}
			}
		}
		
	}

}
