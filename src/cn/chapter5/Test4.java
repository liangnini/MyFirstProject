package cn.chapter5;

import java.util.Scanner;

public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		double price=0.0;
		int goodsNo=0;
		int amount=0;
		double discount=0.8;
		double total=0.0;
		double payment=0.0;
		System.out.println("*************************************\n");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t2.网球鞋\t3.网球拍");
		System.out.println("*************************************\n");
		Scanner input=new Scanner(System.in);
		String answer="y";
		while(answer.equals("y")){
			System.out.print("请输入商品编号：");
			goodsNo=input.nextInt();
			System.out.print("请输入商品数量：");
			amount=input.nextInt();
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
			System.out.println(name+"￥"+price+"\t"+"数量"+amount+"\t"+"合计￥"+price*amount);
			total=total+price*amount;
			System.out.print("是否继续(y/n)");
			answer=input.next();
			
		}
		System.out.println("\n折扣："+discount);
		System.out.println("应付金额："+total*discount);
		System.out.print("实付金额：");
		payment=input.nextDouble();
		System.out.println("找钱:"+(payment-total*discount));
	}

}
