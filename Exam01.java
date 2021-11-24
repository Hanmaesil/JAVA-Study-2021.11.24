import java.util.Random;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 실습 : 1차원 정수형 배열(6)을 선언한 후 임의의 값으로 초기화 합니다.
		// 배열의 값 중 짝수인 값만 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int[] ary = new int[6];
		System.out.print("array에 들어 있는 짝수는 ");

		for (int i = 0; i < 6; i++) {
			int num = ran.nextInt(20) + 1;
			ary[i] = num;
			if (num % 2 == 0)
				System.out.print(num + " ");
		}
		System.out.println(" 입니다.");

		// 실습 : 배열 6칸을 만들어서 임의이 값으로 초기화(scanner를 통해서)

		int[] array = new int[6];

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "째 정수 입력 : ");
			array[i] = sc.nextInt();
		}
		System.out.print("array 안에 있는 짝수는 ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				System.out.print(array[i] + " ");
		}
		System.out.println(" 입니다.");

//		for(int i = 0; i < 6; i++) {
//			System.out.println("array에 들어있는 짝수는");
//			System.out.print(i+1 + "번째 정수 입력 : ");	
//			array[i] = sc.nextInt();
//			if(sc.nextInt()%2 == 0) {
//				System.out.print(sc.nextInt());
//			}
//		}System.out.println(" 입니다.");

	}

}
