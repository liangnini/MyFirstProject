package cn.chapter7.book1;

public class Dsanjiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i  <5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
