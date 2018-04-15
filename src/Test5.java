import java.util.*;
public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("輸入年齡：");
		int age=input.nextInt();
		System.out.println("輸入性別：");
		String sex=input.next();
		if(age>=7||(age>=5&&sex.equals("男"))){
			System.out.println("能搬動椅子");
		}else{
			System.out.println("搬不动椅子");
		}
	}

}
