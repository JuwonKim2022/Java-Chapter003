package sec04.ex05_bit;

public class BitShiftEx {

	public static void main(String[] args) {
		
		System.out.println("1<<3 = "+(1<<3));
		System.out.println("-8>>3 = "+(-8>>3));
		System.out.println("-8>>>3 = "+(-8>>>3));
		System.out.println("=============");
		System.out.println(toBinaryString(-8));
		System.out.println(">>3 = ");
		System.out.println(toBinaryString(-8>>3));
		System.out.println();
		System.out.println(toBinaryString(-8));
		System.out.println(">>>3 = ");
		System.out.println(toBinaryString(-8>>>3));

	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<5) {
			str="0"+str;
		}
		return str;
	}

}