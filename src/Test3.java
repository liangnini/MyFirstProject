import java.util.*;
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("�������ع������ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n");
		Scanner input = new Scanner(System.in);
		System.out.println("�������Ա�ţ�<4λ����>��");
		int custNo = input.nextInt();
		System.out.println("�������Ա���գ���/��<����λ����ʾ>��");
		String custBirth = input.next();
		System.out.println("���������");
		int custScore = input.nextInt();
		if (custNo > 999 && custNo < 10000) {

			System.out.println("\n��¼��Ļ�Ա��Ϣ�ǣ�\n" + custNo + "\t" + custBirth
					+ "\t" + custScore);
		} else {
			System.out.println("��Ϣ¼��ʧ��");
		}
	}

}
