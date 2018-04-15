import java.util.*;
public class Test8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("输入java成绩");
		int java=input.nextInt();
		if(java==100){
			System.out.println("父亲买辆车");
		}else if(java>=90){
			System.out.println("母亲给他买一部笔记本电脑");	
		}else if(java>=60){
			System.out.println("母亲给他买一部手机");	
		}else{
			System.out.println("没有礼物");	
		}
	}

}
