import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// �ǽ� : ȸ������/�α��� ���α׷� �����
		// 1. ȸ������ 2.�α��� 3.����

		String[] idArray = new String[3];
		int[] password = new int[3];
		int index = 0;

		while (true) {
			System.out.println("1. ȸ������ 2. �α��� 3. ����");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("===ȸ������===");
				if (index < 3) {
					System.out.print("id �Է� : ");
					idArray[index] = sc.next();
					System.out.print("pw �Է� : ");
					password[index] = sc.nextInt();;
					index++;
					System.out.println("���� �Ϸ�");
					System.out.println();
				}
			} else if (num == 2) {
				System.out.println("===�α���===");
				System.out.println("id �Է� : ");
				String id = sc.next();
				System.out.println("pw �Է� : ");
				int pw = sc.nextInt();
				
				for(int i = 0; i < 3; i++) {
					if(id == idArray[i] && pw == password[i]) {
						System.out.println("�α���");
					}else
						System.out.println("�ٽ� �Է��ϼ���.");
				}
					
					
					
					
			} else if (num == 3) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}

}
