package cn.chapter6.book1;

import java.util.Scanner;


public class Test64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO	 Auto-generated method stub

		int age;
		int sum=0;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.println("�������"+(i+1)+"λ�˿͵�����");
			age=in.nextInt();
			if(age>0&&age<=30){
				sum++;
				
			}
			
		}
		System.out.println("30�����±����ǣ�"+sum/10.0*100+"%");
		System.out.println("30�����ϱ����ǣ�"+(10-sum)/10.0*100+"%");
		
	}

}
