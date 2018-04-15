import java.util.Scanner;

public class Jsq2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("请输入第一个操作数");
		int first = 0, second = 0;
		
		/*boolean a=input.hasNextInt();
		System.out.println("a="+a);*/
		
		if ( input.hasNextInt()) {
			first = input.nextInt();

			/*
			 * }else{ System.out.println("请输入正确的数字！"); }
			 */

			System.out.println("请输入第二个操作数");
		}
		
		/*input.hasNextLine();
		boolean b=input.hasNextInt();
		System.out.println("b="+b);*/

		if ( input.hasNextInt() ) {
			second = input.nextInt();

			System.out.println("请输入运算符");

			char y = input.next().charAt(0);
			switch (y) {
			case '+':
				System.out.println("计算结果：" + first + "+" + second + "="
						+ (first + second));
				break;
			case '-':
				System.out.println("计算结果：" + first + "-" + second + "="
						+ (first - second));
				break;
			case '*':
				System.out.println("计算结果：" + first + "*" + second + "="
						+ (first * second));
				break;
			case '/':
				System.out.println("计算结果：" + first + "/" + second + "="
						+ (first / second));
				break;
			}
		
		} else {
			System.out.println("请输入正确的2数字！");
		}
		
	}

}
