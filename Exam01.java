import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// �ǽ� : 1���� ������ �迭(6)�� ������ �� ������ ������ �ʱ�ȭ �մϴ�.
		// �迭�� �� �� ¦���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int[] ary = new int[6];
		System.out.print("array�� ��� �ִ� ¦���� ");

		for (int i = 0; i < 6; i++) {
			int num = ran.nextInt(20) + 1;
			ary[i] = num;
			if (num % 2 == 0)
				System.out.print(num + " ");
		}
		System.out.println(" �Դϴ�.");

		// �ǽ� : �迭 6ĭ�� ���� ������ ������ �ʱ�ȭ(scanner�� ���ؼ�)

		int[] array = new int[6];

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "° ���� �Է� : ");
			array[i] = sc.nextInt();
		}
		System.out.print("array �ȿ� �ִ� ¦���� ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				System.out.print(array[i] + " ");
		}
		System.out.println(" �Դϴ�.");

//		for(int i = 0; i < 6; i++) {
//			System.out.println("array�� ����ִ� ¦����");
//			System.out.print(i+1 + "��° ���� �Է� : ");	
//			array[i] = sc.nextInt();
//			if(sc.nextInt()%2 == 0) {
//				System.out.print(sc.nextInt());
//			}
//		}System.out.println(" �Դϴ�.");

	}

}
