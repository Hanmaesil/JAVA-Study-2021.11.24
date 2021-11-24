import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 실습 : 회원가입/로그인 프로그램 만들기
		// 1. 회원가입 2.로그인 3.종료

		String[] idArray = new String[3];
		int[] password = new int[3];
		int index = 0;

		while (true) {
			System.out.println("1. 회원가입 2. 로그인 3. 종료");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("===회원가입===");
				if (index < 3) {
					System.out.print("id 입력 : ");
					idArray[index] = sc.next();
					System.out.print("pw 입력 : ");
					password[index] = sc.nextInt();;
					index++;
					System.out.println("가입 완료");
					System.out.println();
				}
			} else if (num == 2) {
				System.out.println("===로그인===");
				System.out.println("id 입력 : ");
				String id = sc.next();
				System.out.println("pw 입력 : ");
				int pw = sc.nextInt();
				
				for(int i = 0; i < 3; i++) {
					if(id == idArray[i] && pw == password[i]) {
						System.out.println("로그인");
					}else
						System.out.println("다시 입력하세요.");
				}
					
					
					
					
			} else if (num == 3) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
