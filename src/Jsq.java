import java.util.*;

public class Jsq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("�������һ��������");
		int first = 0, second = 0;
		
		if (input.hasNextInt() ) {
			first = input.nextInt();

			/*
			 * }else{ System.out.println("��������ȷ�����֣�"); }
			 */

			System.out.println("������ڶ���������");
		
		if (input.hasNextInt() ) {
			second = input.nextInt();

			System.out.println("�����������");

			char y = input.next().charAt(0);
			switch (y) {
			case '+':
				System.out.println("��������" + first + "+" + second + "="
						+ (first + second));
				break;
			case '-':
				System.out.println("��������" + first + "-" + second + "="
						+ (first - second));
				break;
			case '*':
				System.out.println("��������" + first + "*" + second + "="
						+ (first * second));
				break;
			case '/':
				System.out.println("��������" + first + "/" + second + "="
						+ (first / second));
				break;
			}
		
		} else {
			System.out.println("��������ȷ��2���֣�");
		}
		} else {
			System.out.println("��������ȷ��1���֣�");
		}
	}

}
