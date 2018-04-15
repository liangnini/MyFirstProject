import java.util.*;
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息\n");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员号（<4位整数>）");
		int custNo = input.nextInt();
		System.out.println("请输入会员生日（月/日<用两位数表示>）");
		String custBirth = input.next();
		System.out.println("请输入积分");
		int custScore = input.nextInt();
		if (custNo > 999 && custNo < 10000) {

			System.out.println("\n已录入的会员信息是：\n" + custNo + "\t" + custBirth
					+ "\t" + custScore);
		} else {
			System.out.println("信息录入失败");
		}
	}

}
