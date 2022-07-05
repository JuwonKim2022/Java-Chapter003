package sec04.ex01_arthmatic;

public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;
		double z = 5 / y;
		double a = 5 % y;

		System.out.println(x);
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(a));

		System.out.println(a+2);

		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}

		int b = 5;
		int c = 0;

		try {
			int d = b / c;		//정수를 0으로 나누게 되면 예외 오류
			System.out.println(d);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}

	}
}