package cn.chapter6.book1;

import java.util.Scanner;



public class Test69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.print("�������û���:");
			String name=in.next();
			System.out.print("���������룺");
			int password=in.nextInt();
			if(name.equals("jim")&&password==123){
			System.out.println("��ӭ��½MyShoppingϵͳ��");
				break;
			}else{
				
				System.out.println("�������������"+(2-i)+"����");
				if(i==2){
					System.out.println("\n�Բ�����3�ξ��������");
					
				}
			}
		}
		
	}

}
