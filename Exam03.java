import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		//�ǽ� : ���� �Է� �ް� �Է¹��� ���� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int[] ary = new int[5];
		int[] ans = {1,4,3,2,1};
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1) + "���� : ");
			int answer = sc.nextInt();
			ary[i] = answer;
		}
		System.out.print("�Է��� ���� : ");
		for(int i = 0; i < 5; i++) {
			System.out.print(ary[i]);
			if(i != 4) {
				System.out.print(", ");
			}
		}System.out.println(" �Դϴ�.");
		
		int score = 0;
		
		for(int i = 0; i < 5; i ++) {
			if(ary[i] == ans[i]) {
				System.out.print("O ");
				score += 20;
			}else
				System.out.print("X ");
		}System.out.println("���� : " + score);
		
		//for�� �ѹ��� ����.
//	      int[] answer = { 1, 4, 3, 2, 1 };
//	      int[] input = new int[5];
//	      int sum = 0;
//	      String ox = "";
//	      System.out.println("==ä���ϱ�==");
//	      System.out.println("���� �Է��ϼ���");
//	      Scanner sc = new Scanner(System.in);
//	      for (int a = 0; a < input.length; a++) {
//	         System.out.print(a + 1 + "���� >> ");
//	         input[a] = sc.nextInt();
//	         if (input[a] == answer[a]) {
//	            sum += 20;
//	            ox = ox + "O ";
//	         } else {
//	            ox = ox + "X ";
//	         }
//	      }
//	      System.out.println("����Ȯ��");
//	      System.out.print(ox);
//	      System.out.println("���� : " + sum);
//	      sc.close();
		
		
		
	}

}
