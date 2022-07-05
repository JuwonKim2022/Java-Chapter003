package sec04.ex03_compare;

public class StringEqualsEx {

	public static void main(String[] args) {
		
		String strVar1 = "김주원";
		String strVar2 = "김주원";
		String strVar3 = new String("김주원");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));

	}
}