import java.util.*;
public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�����һ������");
		int a=input.nextInt();
		System.out.println("����ڶ�������");
		int b=input.nextInt();
		System.out.println("�������������");
		int c=input.nextInt();
		int d;

		if(a>b){
			d=a;a=b;b=d;
		}
		if(a>c){
			d=a;a=c;c=d;
		}
		if(b>c){
			d=b;b=c;c=d ;
		}
		System.out.println("��С����˳����:"+a+"\t"+b+"\t"+c);
		
	}

}
