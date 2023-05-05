package ExcaptionHandling;

import java.security.PublicKey;
import java.util.NoSuchElementException;

public class AllExcaptions {

	public static void main(String[] args) {
//		M1();
//
//		int[] x = new int[10];
//		System.err.println(x[0]);
//		System.err.println(x[100]);
//		System.err.println(x[-100]);
//
//	}

//	public static void M1() {
//		String string = null;
//		System.err.println(string.length());

//		class test {
//			public static void M1() {
//				M2();
//			}
//
//			public static void M2() {
//				M1();
//			}
//
//			public static void main(String[] args) {
//				M1();
//
//			}
	
	try {
		System.out.println(10/0);
	} catch (NoSuchElementException e) {
		System.out.println("hello");
	}
//	throw new ArithmeticException();
	
	

}}
	


