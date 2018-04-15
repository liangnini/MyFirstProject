import java.util.*;
public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("请输入您出行的月份:1-12");
		int month=input.nextInt();
		System.out.println("请问你选择头等舱还是经济舱？头等舱请输入1，经济舱请输入2");
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
		System.out.print("您的机票价格为："+money);
	}

}
