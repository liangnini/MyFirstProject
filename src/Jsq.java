import java.util.*;

public class Jsq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("请输入第一个操作数");
		int first = 0, second = 0;
		
		if (input.hasNextInt() ) {
			first = input.nextInt();

			/*
			 * }else{ System.out.println("请输入正确的数字！"); }
			 */

			System.out.println("请输入第二个操作数");
		
		if (input.hasNextInt() ) {
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
		} else {
			System.out.println("请输入正确的1数字！");
		}
	}

}
