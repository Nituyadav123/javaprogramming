package AllProgramming;

import java.security.PublicKey;

//import javax.swing.text.StyledEditorKit.ForegroundAction;
//import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import ObjClassContrusto.StaticNonStaticmethod;

public class FibonacciSeries {

	public static void main(String[] args) {
		name();
		name1();
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);

		for (int i = 0; i <= 5; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}
	}

	public static void name() {
		String objString = "Nitu yadav";
		String bb = objString.toLowerCase();
		System.err.println(bb);
	}

	public static void name1() {
		String objString = "nitu yadav";
		String bb = objString.toUpperCase();
		System.err.println(bb);
	}

	public static void palindrome() {
			String objString="Nitu yadav";
			String s ="";
			
					 for(int i =objString.length(); i>=0; i--) {
						 s += objString.charAt(i);
						 if (objString.equalsIgnoreCase(objString)) {
							System.out.println("it Is palindrome");
						} else {
                            System.out.println("it is not palindrome");
						}
					 }
//					 String name="Anshika";
//						String s="";
//				      for (int i =name.length()-1; i >=0;i--) {
//				    	  s    +=name .charAt(i);
//				    	  }
//						if (name.equalsIgnoreCase(s)) {
//							System.out.println("It's Palindrom");
//						}else {
//							System.out.println("It's not Palindrom");
//						}

}
}