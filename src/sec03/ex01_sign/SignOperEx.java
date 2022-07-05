package sec03.ex01_sign;

public class SignOperEx {

	public static void main(String[] args) {
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;

		System.out.println(result1);
		System.out.println(result2);

		short s = 100;
//		short result3 = -s;	수 범위에서 벗어나서 오류
		int result3 = -s;

		System.out.println(result3);

	}
}
