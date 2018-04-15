package com.baidu.tiyu.gaonei;

import java.util.*;

public class HuanGou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入消费金额：");

		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		System.out.println("是否参加优惠换购活动：");
		System.out.println("1：满50元，加2元换购百事可乐饮料1瓶");
		System.out.println("2.满100元，加3元换购500ml可乐一瓶");
		System.out.println("3.满100元，加10元换购5kg面粉");
		System.out.println("4.满200元，加10元可换购1个苏泊尔炒菜锅");
		System.out.println("5：满200元，加20元可换购欧莱雅爽肤水一瓶");
		System.out.println("0：不换购");
		System.out.print("请选择：");
		if (input.hasNextInt() == true) {
			int num = input.nextInt();
			switch (num) {
			case 1:
				if (money >= 50) {
					System.out.println("本次消费总金额：" + (money + 2));
					System.out.println("成功换购：百事可乐饮料一瓶");
					break;
				} else {
					System.out.println("消费金额不足");
					break;
				}
			case 2:
				if (money >= 100) {
					System.out.println("本次消费总金额：" + (money + 3));
					System.out.println("成功换购:500ml可乐一瓶");
					break;
				} else {
					System.out.println("消费金额不足");
					break;
				}
			case 3:
				if (money >= 100) {
					System.out.println("本次消费总金额：" + (money + 10));
					System.out.println("成功换购:5kg面粉");
					break;
				} else {
					System.out.println("消费金额不足");
					break;
				}

			case 4:
				if (money >= 200) {
					System.out.println("本次消费总金额：" + (money + 10));
					System.out.println("成功换购：1个苏泊尔炒菜锅");
					break;
				} else {
					System.out.println("消费金额不足");
					break;
				}

			case 5:
				if (money >= 200) {
					System.out.println("本次消费总金额：" + (money + 20));
					System.out.println("成功换购：欧莱雅爽肤水一瓶");
					break;
				} else {
					System.out.println("消费金额不足");
					break;
				}
			case 0:
				System.out.println("本次消费总金额：" + money);
				System.out.println("不换购");
				break;
			default:
				System.out.println("输入错误");
				break;
			}
		} else {
			System.out.println("请输入正确的数字！");
		}
	}

}
