
import java.util.*;
public class Test1 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�����빺����Ʒ������");
		String name=input.next();
		System.out.println("������"+name+"�ĵ���");
		int price=input.nextInt();
		System.out.println("������"+name+"�ĸ���");
		int num=input.nextInt();
		int myPrice=price*num;
		
		System.out.println("�����빺����Ʒ������");
		String name2=input.next();
		System.out.println("������"+name2+"�ĵ���");
		int price2=input.nextInt();
		System.out.println("������"+name2+"�ĸ���");
		int num2=input.nextInt();
		int myPrice2=price2*num2;
		
		System.out.println("�����빺����Ʒ������");
		String name3=input.next();
		System.out.println("������"+name3+"�ĵ���");
		int price3=input.nextInt();
		System.out.println("������"+name3+"�ĸ���");
		int num3=input.nextInt();
		int myPrice3=price3*num3;
		
		System.out.println("************���ѵ�*************");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println(name+"\t��"+price+"\t"+num+"\t��"+myPrice);
		System.out.println(name2+"\t��"+price2+"\t"+num2+"\t��"+myPrice2);
		System.out.println(name3+"\t��"+price3+"\t"+num3+"\t��"+myPrice3);
		Double discount=0.8;
		System.out.println("\n�ۿۣ�\t8��");
		double finalPay= (myPrice+myPrice2+myPrice3)*discount;
		System.out.println("�����ܽ�"+finalPay);
		System.out.println("�븶�");
		int payMoeny=input.nextInt();
		System.out.println("ʵ�ʽ��ѣ�\t"+payMoeny);
		System.out.println("��Ǯ��"+(payMoeny-finalPay));
		
		int score=(int)finalPay*3/100;
		System.out.println("���ι�������û����ǣ�"+score);
		
	}
}
