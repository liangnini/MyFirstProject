package cn.chapter7.book1;

import java.util.Scanner;

public class Test713 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] num={"a","b","c","e","f","p","u","z",""};
		System.out.print("原字符序列：");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.print("\n请输入要插入的数据：");
		String  number=input.next();
		System.out.print("\n待插入的字符是："+number);
		int index=0;
		num[num.length-1]=number;// 循环外赋值   
		for (int i = num.length-1; i >0; i--) {
			if(num[i].compareTo(num[i-1])<0){ // 此处应使用  < 号   字符串比较 的 是 assci 码值  a-z 从小到大   a.compareTo（b）<0  表示 ：   a 在前
				String temp=num[i];
				num[i]=num[i-1];
				num[i-1]=temp;
				index=i;
		//不需要加break		break;  
			}
		}
		System.out.print("\n下标是:"+index);
//此处 给 下标为 index 的 位置赋值 会将 该位置原有的数值 覆盖   		num[index]=number;
		System.out.println("\n输入后的序列是：");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"  ");
		}	
		}

}
