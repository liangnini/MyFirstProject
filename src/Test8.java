import java.util.*;
public class Test8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("����java�ɼ�");
		int java=input.nextInt();
		if(java==100){
			System.out.println("����������");
		}else if(java>=90){
			System.out.println("ĸ�׸�����һ���ʼǱ�����");	
		}else if(java>=60){
			System.out.println("ĸ�׸�����һ���ֻ�");	
		}else{
			System.out.println("û������");	
		}
	}

}
