import java.util.*;
public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("ݔ�����g��");
		int age=input.nextInt();
		System.out.println("ݔ���Ԅe��");
		String sex=input.next();
		if(age>=7||(age>=5&&sex.equals("��"))){
			System.out.println("�ܰ������");
		}else{
			System.out.println("�᲻������");
		}
	}

}
