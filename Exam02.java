import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// �ǽ� : �迭�� �ε����� ����ŭ ���� ����غ�����.(��ĳ�� ���)

		Scanner sc = new Scanner(System.in);
		int[] ary = new int[5];
		System.out.print("���� �Է� : ");
		for (int i = 0; i < 5; i++) {
			int j = sc.nextInt();
			ary[i] = j;
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " : ");
			for (int j = 0; j < ary[i]; j++) { 

				System.out.print("*");

			}System.out.println("");
		}
	}
}

