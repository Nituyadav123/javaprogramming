package AllProgramming;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		Set<Character>  data=new LinkedHashSet<Character>();
		String wordString ="I am nitu yadav".toLowerCase();
		for (int i = 0; i < wordString.length(); i++) {
			char xyz =wordString.charAt(i);
			data.add(xyz);
		}
		Iterator<Character> abc=data.iterator();
		while( abc.hasNext()==true) {
		System.out.print(abc.next());
		
		/*String O = " i am nitu yadav";

		StringBuffer S = new StringBuffer();
		for (int i = 0; i < O.length(); i++) {
			char Ch = O.charAt(i);

			int l = O.indexOf(Ch, i+2 );
			if (l == -1) {
				S.append(Ch);
			}

		}
		System.err.println("The non repeated character in the given String are:" + S);
	}
     public static void name() {
		/*String obj ="My Self Nitu Yadav".toLowerCase();
		String []sn= obj.split(" ");
		int temp=1;
		String s="";
		for (int i = 0; i < sn.length; i++) {
			s+=sn[i];
		}
		char[]arr=s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					temp++;
				}
			}
			if (temp==2) {
				System.out.println(arr[i]);
			}
			temp=1;*/
    	 
    	 
    	 
		}
		
	}
	}

