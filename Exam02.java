import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// 실습 : 배열의 인덱스의 수만큼 별을 출력해보세요.(스캐너 사용)

		Scanner sc = new Scanner(System.in);
		int[] ary = new int[5];
		System.out.print("숫자 입력 : ");
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

