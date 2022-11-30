import java.util.Random;
import java.util.Scanner;

// Up&Down���� (�Լ� ��� ��)
//	��ǻ�� : 1 ~ 100 ������ ���ڸ� ���� (ex: 34)
//	������ �Է�
//		1Ʈ : 50 -> down
//		2Ʈ : 20 -> up
//		,,,
//		10Ʈ : 34 -> ����


public class YMain1 {
	// �� ����
//	public static int getNum() {
//		Random r = new Random();
//		int num = r.nextInt(100) + 1;
//		return num;
//	}
//	public static void answer(int num) {
//		Scanner k = new Scanner(System.in);
//		for (int i = 1; true; i++) {
//			System.out.print("���ڸ� �Է��ϼ��� : ");
//			int answer = k.nextInt();
//			if (answer == num) {
//				System.out.printf("%dƮ : ����\n", i);
//				break;
//			} else if (answer > num) {
//				System.out.printf("%dƮ : down\n", i);
//			} else if (answer < num) {
//				System.out.printf("%dƮ : up\n",i);
//			}
//		}
//	}
	
	// ����
	
	// ��ǻ�Ͱ� 1 ~ 100 ������ ���ڸ� �ϳ� �̾��ִ� �Լ�
	public static int getNum() {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		return num;
	}
	// ������ ���� �Է��� �� �ִ� �Լ�
	public static int getUserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("������? : ");
		int answer = k.nextInt();
		if (answer < 1) {
			System.out.println("������ 1 �̻��̾�� �մϴ�.");
		} else if (answer > 100) {
			System.out.println("������ 100 �����̾�� �մϴ�.");
		}
		return (answer >= 1 && answer <= 100) ? answer : getUserAns() ;
	}
	// ������ �� �� �Է����� �� �������� �ƴ��� Ȯ�� + �ݺ����� ���� ���� ���޵�
	public static boolean checkAnswer(int num, int answer) {
		if (answer == num) {
			System.out.println("����!");
//			return true; 		// ������ �� true���� �����ϸ鼭 ����ǰ�
		} else if (num > answer) {
			System.out.println("up !");
//			return false;		// ������  �ƴҶ� false���� �����ϸ鼭 ������ ��� ����
		} else {
			System.out.println("Down !");
//			return false;		// ������  �ƴҶ� false���� �����ϸ鼭 ������ ��� ����
		}
		return num == answer;	// �� ���ǿ� ������ true
								// ���ǿ� ���� ������ false���� ����
	}
	// ������ ���⶧���� �ݺ��ϴ� �Լ�
	public static void printResult(int num, int answer) {
		int turn = 0;
		while (true) {
			turn++;
			answer = getUserAns();
			if (checkAnswer(num, answer)) {
				System.out.printf("%d�� ���� ����!\n", turn);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
//		int num = getNum();
//		answer(num);
		
		int num = getNum();
		int answer = 0;
		printResult(num, answer);
	}
}
