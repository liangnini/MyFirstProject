package cn.chapter5;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 2;
		while (i <= 100) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("100以内的偶数和：" + sum);

	}

}
