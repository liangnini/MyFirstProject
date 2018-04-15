package cn.chapter5;

public class Testhe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		do{
			if(i%7==0){
				sum=sum+i;
			}
			i++;
		}while(i<=50);
		System.out.println("ºÍ"+sum);
	}
	
}
