import java.util.Scanner;


public class Test10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���������ڼ���");
		Scanner input=new Scanner(System.in);
		int xq=input.nextInt();
		switch(xq){
			case 1:
			case 3:	
			case 5:
				System.out.println("ѧϰ���");
				break;
			case 2:
			case 4:
			case 6:
				System.out.println("ѧϰӢ��");
				break;
			case 7:
				System.out.println("��Ϣ");
				break;
			default:
				System.out.println("�������");
				break;
		}
	}

}
