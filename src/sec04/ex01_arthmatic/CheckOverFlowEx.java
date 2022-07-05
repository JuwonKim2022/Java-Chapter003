package sec04.ex01_arthmatic;

public class CheckOverFlowEx {

	public static void main(String[] args) {
		
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {	//산술연산 예
			System.out.println("오버플로우가 발생하여 계산할 수 없음");
		}

	}
	
	public static int safeAdd(int left, int right) {
		if(right>0) {
			if(left > (Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left < (Integer.MIN_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}

}