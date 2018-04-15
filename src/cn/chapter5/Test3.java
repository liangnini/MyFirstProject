package cn.chapter5;

public class Test3 {
public static void main(String[] args) {
	double sum=25;
	int i=2012;
	while(sum<=100){
	
		sum=sum+sum*0.25;
		i++;
	}
	System.out.println(i+"年达到100万!");
}
}
