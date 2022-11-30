import java.util.Random;
import java.util.Scanner;

// Up&Down게임 (함수 사용 ㅇ)
//	컴퓨터 : 1 ~ 100 사이의 숫자를 뽑음 (ex: 34)
//	유저가 입력
//		1트 : 50 -> down
//		2트 : 20 -> up
//		,,,
//		10트 : 34 -> 정답


public class YMain1 {
	// 내 정답
//	public static int getNum() {
//		Random r = new Random();
//		int num = r.nextInt(100) + 1;
//		return num;
//	}
//	public static void answer(int num) {
//		Scanner k = new Scanner(System.in);
//		for (int i = 1; true; i++) {
//			System.out.print("숫자를 입력하세요 : ");
//			int answer = k.nextInt();
//			if (answer == num) {
//				System.out.printf("%d트 : 정답\n", i);
//				break;
//			} else if (answer > num) {
//				System.out.printf("%d트 : down\n", i);
//			} else if (answer < num) {
//				System.out.printf("%d트 : up\n",i);
//			}
//		}
//	}
	
	// 정답
	
	// 컴퓨터가 1 ~ 100 사이의 숫자를 하나 뽑아주는 함수
	public static int getNum() {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		return num;
	}
	// 유저가 답을 입력할 수 있는 함수
	public static int getUserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("정답은? : ");
		int answer = k.nextInt();
		if (answer < 1) {
			System.out.println("정답은 1 이상이어야 합니다.");
		} else if (answer > 100) {
			System.out.println("정답은 100 이하이어야 합니다.");
		}
		return (answer >= 1 && answer <= 100) ? answer : getUserAns() ;
	}
	// 정답을 한 번 입력했을 때 정답인지 아닌지 확인 + 반복문을 깰지 말지 전달됨
	public static boolean checkAnswer(int num, int answer) {
		if (answer == num) {
			System.out.println("정답!");
//			return true; 		// 정답일 떼 true값을 리턴하면서 종료되게
		} else if (num > answer) {
			System.out.println("up !");
//			return false;		// 정답이  아닐때 false값을 리턴하면서 게임을 계속 진행
		} else {
			System.out.println("Down !");
//			return false;		// 정답이  아닐때 false값을 리턴하면서 게임을 계속 진행
		}
		return num == answer;	// 이 조건에 맞으면 true
								// 조건에 맞지 않으면 false값을 리턴
	}
	// 정답을 맞출때까지 반복하는 함수
	public static void printResult(int num, int answer) {
		int turn = 0;
		while (true) {
			turn++;
			answer = getUserAns();
			if (checkAnswer(num, answer)) {
				System.out.printf("%d번 만에 정답!\n", turn);
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
