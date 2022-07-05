package sec04.ex01_arthmatic;

public class AccurancyEx2 {

	public static void main(String[] args) {
		
		double result1 = 7 * 0.1;
		
		System.out.println(result1);
		
		int apple = 1;
		double piecsUnit = 0.1;
		int number = 7;
		
		double result2 = apple - number * piecsUnit;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7조각을 빼면");
		System.out.println(result2 + "조각이 남는다.");

	}

}