import java.util.Scanner;


public class Test10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入星期几：");
		Scanner input=new Scanner(System.in);
		int xq=input.nextInt();
		switch(xq){
			case 1:
			case 3:	
			case 5:
				System.out.println("学习编程");
				break;
			case 2:
			case 4:
			case 6:
				System.out.println("学习英语");
				break;
			case 7:
				System.out.println("休息");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
	}

}
