package cn.chapter7.book1;

public class Jinzita {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5 ; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
