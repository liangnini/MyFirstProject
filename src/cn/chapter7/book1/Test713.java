package cn.chapter7.book1;

import java.util.Scanner;

public class Test713 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[] num={"a","b","c","e","f","p","u","z",""};
		System.out.print("ԭ�ַ����У�");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.print("\n������Ҫ��������ݣ�");
		String  number=input.next();
		System.out.print("\n��������ַ��ǣ�"+number);
		int index=0;
		num[num.length-1]=number;// ѭ���⸳ֵ   
		for (int i = num.length-1; i >0; i--) {
			if(num[i].compareTo(num[i-1])<0){ // �˴�Ӧʹ��  < ��   �ַ����Ƚ� �� �� assci ��ֵ  a-z ��С����   a.compareTo��b��<0  ��ʾ ��   a ��ǰ
				String temp=num[i];
				num[i]=num[i-1];
				num[i-1]=temp;
				index=i;
		//����Ҫ��break		break;  
			}
		}
		System.out.print("\n�±���:"+index);
//�˴� �� �±�Ϊ index �� λ�ø�ֵ �Ὣ ��λ��ԭ�е���ֵ ����   		num[index]=number;
		System.out.println("\n�����������ǣ�");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"  ");
		}	
		}

}
