import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������ع������ϵͳ>���˳齱");
		System.out.println("\n������4λ��Ա�ţ�");
		Scanner input=new Scanner(System.in);
		int no=input.nextInt();
		int baiwei=no/100%10;
		System.out.println(baiwei);
		int radom=(int)(Math.random()*10);
		if(baiwei==radom){
			System.out.println(no+"�ſͻ������˿ͻ�������MP3һ����");
		}else{
			System.out.println(no+"�ſͻ���лл����֧�֣�");

		}
		
	}

}
