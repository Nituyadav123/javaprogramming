package AllProgramming;

public class Palindrom {

	public static void main(String[] args) {
		String name="Anshika";
		String s="";
      for (int i =name.length()-1; i >=0;i--) {
    	  s    +=name .charAt(i);
    	  }
		if (name.equalsIgnoreCase(s)) {
			System.out.println("this is Palindrom");
		}else {
			System.out.println("this is not Palindrom");
		}
		

		}
	}
	


