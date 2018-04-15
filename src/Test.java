import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("我行我素购物管理系统>幸运抽奖");
		System.out.println("\n请输入4位会员号：");
		Scanner input=new Scanner(System.in);
		int no=input.nextInt();
		int baiwei=no/100%10;
		System.out.println(baiwei);
		int radom=(int)(Math.random()*10);
		if(baiwei==radom){
			System.out.println(no+"号客户是幸运客户，获精美MP3一个。");
		}else{
			System.out.println(no+"号客户，谢谢您的支持！");

		}
		
	}

}
