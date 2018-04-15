package cn.chapter5;

public class Sh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hua=0;
		int she=0;
		int line=1;
		do{
			hua=(int)(she*9/5.0+32);
			System.out.println(hua+"\t"+she);
			she=she+20;
			line++;
			
		}while(line<=10&&she<=250);
	
	}

}
