package ExcaptionHandling;

import java.io.FileNotFoundException;

public class TryCatch {

	public static void main(String[] args) throws InterruptedException,FileNotFoundException{
		/*
		 * try { System.out.println(10 / 0); } catch (ArithmeticException e) {
		 * System.out.println(10 / 0); }
		 * 
		 * finally { String string = null; System.out.println(string.length()); }
		 */
		try {
			//System.out.println("try");
			//System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println("catch block executed");
		} finally {
			System.out.println("Finally block executed");
		}
		Thread.sleep(2000);
		
		try {
		System.out.println("try block executed");
		System.out.println(10/0);
		
		} catch (NullPointerException e) {
			System.out.println("catch block executed");
		}	catch (Exception h) {
				
			}
		finally {
			System.out.println("finally block executed");
		}
	
	
	}
}