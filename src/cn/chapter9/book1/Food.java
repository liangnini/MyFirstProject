package cn.chapter9.book1;

import java.util.Scanner;

public class Food {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// �������壬һ�鶩����Ϣ
		String[] names = new String[4];				 // ���涩��������
		String[] dishMegs = new String[4]; 			// ������ѡ��Ϣ��������Ʒ��������
		int[] times = new int[4]; 					// �����Ͳ�ʱ��
		String[] addresses = new String[4]; 		// �����Ͳ͵�ַ
		int[] states = new int[4]; 					// ���涩����״̬��0 ��ʾ��Ԥ����1 ��ʾ�����
		double[] sumPrices = new double[4]; 		// ���涩�����ܽ��

		// ��ѡ��Ĳ�Ʒ��Ϣ
		String[] dishNames = { "���մ���", "������˿", "ʱ���߲�" };			 // ��Ʒ����
		double[] prices = new double[] { 38.0, 20.0, 10.0 }; 		// ��Ʒ����
		int[] praiseNums = new int[]{23,32,25}; 								// ������

		// ��ʼ����һ��������Ϣ
		names[0] = "����";
		dishMegs[0] = "���մ��� 2��";
		times[0] = 12;
		addresses[0] = "���·207��";
		sumPrices[0] = 76.0;
		states[0] = 1;

		// ��ʼ���ڶ���������Ϣ
		names[1] = "����";
		dishMegs[1] = "������˿ 2��";
		times[1] = 18;
		addresses[1] = "���·207��";
		sumPrices[1] = 45.0;
		states[1] = 0;

		// ϵͳ���˵�
		int num = 1;
		boolean isExit=false;
		do {
			System.out.println("\n��ӭʹ�á��Ի����˶���ϵͳ��");
			System.out.println("********************************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ǩ�ն���");
			System.out.println("4.ɾ������");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("********************************");

			//ѡ��˵�
			Scanner input = new Scanner(System.in);
			System.out.print("\n��ѡ��");
			String choice = input.next();
			switch (choice) {
			case "1":
				//��Ҫ����
				System.out.println("***��Ҫ����***");
				boolean isAdd=false;									//�Ƿ���Զ���
				for (int i = 0; i < names.length; i++) {
					if(names[i]==null){									//�ҵ���һ����λ�ã�������Ӷ�����Ϣ
						isAdd=true;										//�ñ�־λ�����Զ���
						System.out.println("�����붩���˵�������");
						String name=input.next();
						//��ʾ��ѡ��Ĳ�Ʒ
						System.out.println("���"+"\t"+"����"+"\t"+"����"+"\t"+"������");
						for (int j = 0; j < dishNames.length; j++) {
							String price=prices[j]+"Ԫ";
							String priaiseNum=praiseNums[j]>0?praiseNums[j]+"��":"0";
							System.out.println((j+1)+"\t"+dishNames[j]+"\t"+price+"\t"+priaiseNum);
						}
						//�û����
						System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
						int chooseDish=input.nextInt();
						System.out.print("��ѡ������Ҫ�ķ�����");
						int number=input.nextInt();
						String dishMeg=dishNames[chooseDish-1]+"  "+number+"��";
						double sumPrice=prices[chooseDish-1]*number;
						//�ͷ���50Ԫ�����Ͳͷ�
						double deliCharge=sumPrice>=50?0:5;
						System.out.print("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ�:");
						int time=input.nextInt();
						while (time<10||time>20) {
							System.out.print("������������������10-20����������");
							time=input.nextInt();
						}
						System.out.print("�������Ͳ͵�ַ��");
						String address=input.next();
						
						//�������״̬��Ĭ����0������Ԥ��״̬
						System.out.println("���ͳɹ���");
						System.out.println("�������ǣ�"+dishMeg);
						System.out.println("�Ͳ�ʱ�䣺"+time+"��");
						System.out.println("�ͷѣ�"+sumPrice+"Ԫ,�Ͳͷ�"+deliCharge+"Ԫ���ܼ�"+(sumPrice+deliCharge)+"Ԫ��");
						
						//�������
						names[i]=name;
						dishMegs[i]=dishMeg;
						times[i]=time;
						addresses[i]=address;
						sumPrices[i]=sumPrice+deliCharge;
						break;
					}
				}
				if (!isAdd) {
					System.out.println("�Բ������Ĳʹ�������");
				}
				break;
			case "2":
				//�鿴�ʹ�
				System.out.println("***�鿴�ʹ�***");
				System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�����\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
				for (int i = 0; i < names.length; i++) {
					if (names[i]!=null) {
						String state=states[i]==0?"��Ԥ��":"�����";
						String date=times[i]+"��";
						String sumPrice=sumPrices[i]+"Ԫ";
						System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+date+"\t"+addresses[i]+"\t"+sumPrice+"\t"+state);
					}
				}
				break;
			case "3":
				//ǩ�ն���
				System.out.println("***ǩ�ն���***");
				boolean isSignFind=false;                //�ҵ�Ҫǩ�յĶ���
				System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
				int signOrderId=input.nextInt();
				for (int i = 0; i < names.length; i++) {
					//״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ż�1����ǩ��
					//״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ż�1������ǩ��
					if(names[i]!=null&&states[i]==0&&signOrderId==i+1) {
						states[i]=1;						//��״ֵ̬��Ϊ�����
						System.out.println("����ǩ�ճɹ���");
						isSignFind=true;					//������ҵ��˶���
					}else if (names[i]!=null&&states[i]==1&&signOrderId==i+1) {
						System.out.println("��ѡ��Ķ��������ǩ�������ٴ�ǩ�գ�");
						isSignFind=true;					//������ҵ��˶���
					}
				}
				//δ�ҵ��Ķ�����ţ�����ǩ��
				if (!isSignFind) {
					System.out.println("��ѡ��Ķ��������ڣ�");
				}
				break;
			case "4":
				//ɾ������
				System.out.println("***ɾ������***");
				boolean isDelFind=false;							//����Ƿ��ҵ�Ҫɾ���Ķ���
				System.out.println("������Ҫɾ���Ķ�����ţ�");
				int delId=input.nextInt();
				for (int i = 0; i < names.length; i++) {
					//״̬Ϊ����ɣ����Ϊ�û�����Ķ�����ż�1����ɾ��
					//״̬Ϊ��Ԥ�������Ϊ�û�����Ķ�����ż�1������ɾ��
					if (names[i]!=null&&states[i]==1&&delId==i+1) {
						isDelFind=true;						//������ҵ��˶���
						//ִ��ɾ��������ɾ��λ�ú��Ԫ������ǰ��
						for (int j =delId; j < names.length; j++) {
							names[j]=names[j+1];
							dishMegs[j]=dishMegs[j+1];
							times[j]=times[j+1];
							addresses[j]=addresses[j+1];
							states[j]=states[j+1];
							sumPrices[j]=sumPrices[j+1];
						}
						//���һλ���
						int endIndex=names.length-1;
						names[endIndex]=null;
						dishMegs[endIndex]=null;
						times[endIndex]=0;
						addresses[endIndex]=null;
						states[endIndex]=0;
						sumPrices[endIndex]=0;
						System.out.println("ɾ�������ɹ���");
						break;
					}
				}
				//δ�ҵ�����ŵĶ���������ɾ��
				if (!isDelFind) {
					System.out.println("��Ҫɾ���Ķ��������ڣ�");
				}
				break;
			case "5":
				//��Ҫ����
				System.out.println("***��Ҫ����***");
				//��ʾ��Ʒ��Ϣ
				System.out.println("���"+"\t"+"����"+"\t"+"����");
				for (int i = 0; i < dishNames.length; i++) {
					String price=prices[i]+"Ԫ";
					String priaiseNum=praiseNums[i]>0?praiseNums[i]+"��":"";
					System.out.println((i+1)+"\t"+dishNames[i]+"\t"+price+"\t"+priaiseNum);
				}
				System.out.println("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
				int priaiseNum=input.nextInt();
				praiseNums[priaiseNum-1]++;			//������1
				System.out.println("���޳ɹ���");
				break;
			case "6":
				//�˳�ϵͳ
				isExit=true;
				break;
			default:
				//�˳�ϵͳ
				isExit=true;
				break;
			}
			
			//��0���أ����˳�ϵͳ
			if(!isExit){
				System.out.print("����0���أ�");
				num=input.nextInt();
			}else{
				System.out.println("ллʹ�ã���ӭ�´ι��٣�");
				break;
			}
		} while (num == 0);
	}

}
