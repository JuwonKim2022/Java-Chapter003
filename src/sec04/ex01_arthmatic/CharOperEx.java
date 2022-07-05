package sec04.ex01_arthmatic;

public class CharOperEx {

	public static void main(String[] args) {
		
		char c1 = 'A' + 1;
		char c2 = 'A';
//		char c3 = c2 + 1;	산술연산은 기본적으로 int로 계산
		int result = c2 + 1;
		
		System.out.println(c1);
		System.out.println(result);
		
		char c3 = (char) result;	//2바이트를 1바이트씩 쪼갠 후 문자로 변환
		
		System.out.println(c3);

	}

}