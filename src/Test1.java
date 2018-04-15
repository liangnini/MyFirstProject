
import java.util.*;
public class Test1 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入购买商品的名称");
		String name=input.next();
		System.out.println("请输入"+name+"的单价");
		int price=input.nextInt();
		System.out.println("请输入"+name+"的个数");
		int num=input.nextInt();
		int myPrice=price*num;
		
		System.out.println("请输入购买商品的名称");
		String name2=input.next();
		System.out.println("请输入"+name2+"的单价");
		int price2=input.nextInt();
		System.out.println("请输入"+name2+"的个数");
		int num2=input.nextInt();
		int myPrice2=price2*num2;
		
		System.out.println("请输入购买商品的名称");
		String name3=input.next();
		System.out.println("请输入"+name3+"的单价");
		int price3=input.nextInt();
		System.out.println("请输入"+name3+"的个数");
		int num3=input.nextInt();
		int myPrice3=price3*num3;
		
		System.out.println("************消费单*************");
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println(name+"\t￥"+price+"\t"+num+"\t￥"+myPrice);
		System.out.println(name2+"\t￥"+price2+"\t"+num2+"\t￥"+myPrice2);
		System.out.println(name3+"\t￥"+price3+"\t"+num3+"\t￥"+myPrice3);
		Double discount=0.8;
		System.out.println("\n折扣：\t8折");
		double finalPay= (myPrice+myPrice2+myPrice3)*discount;
		System.out.println("消费总金额："+finalPay);
		System.out.println("请付款：");
		int payMoeny=input.nextInt();
		System.out.println("实际交费：\t"+payMoeny);
		System.out.println("找钱："+(payMoeny-finalPay));
		
		int score=(int)finalPay*3/100;
		System.out.println("本次购物所获得积分是："+score);
		
	}
}
