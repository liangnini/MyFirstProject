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
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*************************************\n");
		Scanner input=new Scanner(System.in);
		String answer="y";
		while(answer.equals("y")){
			System.out.print("��������Ʒ��ţ�");
			goodsNo=input.nextInt();
			System.out.print("��������Ʒ������");
			amount=input.nextInt();
			switch(goodsNo){
				case 1:
					name="T��";
					price=245.0;
					break;
				case 2:
					name="����Ь";
					price=570.0;
					break;
				case 3:
					name="������";
					price=320.0;
					break;
			}
			System.out.println(name+"��"+price+"\t"+"����"+amount+"\t"+"�ϼƣ�"+price*amount);
			total=total+price*amount;
			System.out.print("�Ƿ����(y/n)");
			answer=input.next();
			
		}
		System.out.println("\n�ۿۣ�"+discount);
		System.out.println("Ӧ����"+total*discount);
		System.out.print("ʵ����");
		payment=input.nextDouble();
		System.out.println("��Ǯ:"+(payment-total*discount));
	}

}
