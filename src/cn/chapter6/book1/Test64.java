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
			System.out.println("请输入第"+(i+1)+"位顾客的年龄");
			age=in.nextInt();
			if(age>0&&age<=30){
				sum++;
				
			}
			
		}
		System.out.println("30岁以下比例是："+sum/10.0*100+"%");
		System.out.println("30岁以上比例是："+(10-sum)/10.0*100+"%");
		
	}

}
