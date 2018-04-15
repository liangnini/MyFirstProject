import java.util.*;
public class Tesr7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入整数");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if(a%3==0||a%5==0){
			System.out.println("该整数是3或5的倍数");
		}else{

			System.out.println("该整数不能被3或5中的任何一个整数除");
		}
	}

}
