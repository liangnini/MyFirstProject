package cn.chapter6.book1;

import java.util.Scanner;

public class Test68 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息\n");
		int custNo;
		String birthday;
		int points=0;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.print("请输入会员号（<4位整数>）：");
			custNo=in.nextInt();
			System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
			birthday=in.next();
			System.out.print("请输入会员积分：");
			points=in.nextInt();
			if(custNo<1000||custNo>9999){
				System.out.println("输入无效");
				continue;
			}
			System.out.println("您录入的会员信息是：");
			System.out.println(custNo+" "+birthday+" "+points+"\n");
		}
		System.out.println("程序结束！");
	}

}
