package cn.chapter6.book1;

import java.util.Scanner;

public class Test68 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
		int custNo;
		String birthday;
		int points=0;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.print("�������Ա�ţ�<4λ����>����");
			custNo=in.nextInt();
			System.out.print("�������Ա���գ���/��<����λ������ʾ>����");
			birthday=in.next();
			System.out.print("�������Ա���֣�");
			points=in.nextInt();
			if(custNo<1000||custNo>9999){
				System.out.println("������Ч");
				continue;
			}
			System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
			System.out.println(custNo+" "+birthday+" "+points+"\n");
		}
		System.out.println("���������");
	}

}
