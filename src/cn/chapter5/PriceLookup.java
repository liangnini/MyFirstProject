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
		System.out.println("MyShopping����ϵͳ>�������\n");
		System.out.println("*************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t2.����Ь\t3.������");
		System.out.println("*************************************");
		Scanner input=new Scanner(System.in);
		String answer="y";
		while(answer.equals("y")){
			System.out.print("��������Ʒ��ţ�");
			goodsNo=input.nextInt();
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
			System.out.println(name+"\t"+"��"+price+"\n");
			System.out.println("�Ƿ����(y/n)");
			answer=input.next();
			
		}
		System.out.println("�������");
	}

}
