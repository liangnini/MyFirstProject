package cn.chapter7.book1;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] a=new int[]{8,4,2,1,23,344,12};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
			sum+=a[i];
		}
		System.out.println("��Ϊ��"+sum);
		Scanner input=new Scanner(System.in);
		System.out.println("�������ݣ�");
		int num=input.nextInt();
		int i=0;
		for (; i< a.length; i++) {
			if(num==a[i]){
				System.out.println("��"+i+"����");
				break;
			}
		}
		if(i==a.length){
			System.out.println("û�ҵ�");
		}

	}

}
