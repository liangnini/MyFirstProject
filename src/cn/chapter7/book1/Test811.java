package cn.chapter7.book1;

import java.util.Scanner;

public class Test811 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int [4];
		int count=0;
		Scanner input=new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("输入"+(i+1)+"班成绩");
			for (int j = 0; j < 4; j++) {
				System.err.println("输入"+(j+1)+"成绩");
				score[i]=input.nextInt();
				if(score[i]>85){
					count++;
				}
			}
		}
		System.err.println(count);
	}

}
