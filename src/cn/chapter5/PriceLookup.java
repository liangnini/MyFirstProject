package cn.chapter5;

import java.util.Scanner;

public class PriceLookup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		double price=0;
		int goodsNo=0;
		System.out.println("MyShopping管理系统>购物结算\n");
		System.out.println("*************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("*************************************");
		Scanner input=new Scanner(System.in);
		String answer="y";
		while(answer.equals("y")){
			System.out.print("请输入商品编号：");
			goodsNo=input.nextInt();
			switch(goodsNo){
				case 1:
					name="T恤";
					price=245.0;
					break;
				case 2:
					name="网球鞋";
					price=570.0;
					break;
				case 3:
					name="网球拍";
					price=320.0;
					break;
			}
			System.out.println(name+"\t"+"￥"+price+"\n");
			System.out.println("是否继续(y/n)");
			answer=input.next();
			
		}
		System.out.println("程序结束");
	}

}
