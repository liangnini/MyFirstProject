package cn.chapter7.book1;

public class MaoPao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={12,43,2,47,98,5};
		for (int i = 0; i < num.length-1; i++) {
			for (int j = 0; j < num.length-1-i; j++) {
				if (num[j]>num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.err.println("≈≈–Ú∫Û");
		for (int i = 0; i < num.length; i++) {
			System.err.print(num[i]+"\t");
		}
	}

}
