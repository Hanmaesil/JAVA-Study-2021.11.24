import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		//실습 : 답을 입력 받고 입력받은 값을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[5];
		int[] ans = {1,4,3,2,1};
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번답 : ");
			int answer = sc.nextInt();
			ary[i] = answer;
		}
		System.out.print("입력한 답은 : ");
		for(int i = 0; i < 5; i++) {
			System.out.print(ary[i]);
			if(i != 4) {
				System.out.print(", ");
			}
		}System.out.println(" 입니다.");
		
		int score = 0;
		
		for(int i = 0; i < 5; i ++) {
			if(ary[i] == ans[i]) {
				System.out.print("O ");
				score += 20;
			}else
				System.out.print("X ");
		}System.out.println("총점 : " + score);
		
		//for문 한번만 쓰기.
//	      int[] answer = { 1, 4, 3, 2, 1 };
//	      int[] input = new int[5];
//	      int sum = 0;
//	      String ox = "";
//	      System.out.println("==채점하기==");
//	      System.out.println("답을 입력하세요");
//	      Scanner sc = new Scanner(System.in);
//	      for (int a = 0; a < input.length; a++) {
//	         System.out.print(a + 1 + "번답 >> ");
//	         input[a] = sc.nextInt();
//	         if (input[a] == answer[a]) {
//	            sum += 20;
//	            ox = ox + "O ";
//	         } else {
//	            ox = ox + "X ";
//	         }
//	      }
//	      System.out.println("정답확인");
//	      System.out.print(ox);
//	      System.out.println("총점 : " + sum);
//	      sc.close();
		
		
		
	}

}
