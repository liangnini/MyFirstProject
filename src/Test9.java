import java.util.*;
public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("�����������е��·�:1-12");
		int month=input.nextInt();
		System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�������1�����ò�������2");
		int cang=input.nextInt();
		double money=5000;
		if(month>=4&&month<=10){
			if(cang==1){
				money=money*0.9;
			}else if(cang==2){
				money=money*0.8;
			}
			
		}else{
			if(cang==1){
				money=money*0.5;
			}else if(cang==2){
				money=money*0.4;
			}
		}
		System.out.print("���Ļ�Ʊ�۸�Ϊ��"+money);
	}

}
