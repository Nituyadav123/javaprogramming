package CollectionFramework;

import java.util.Stack;
import java.util.Vector;

public class legacy {

	public static void main(String[] args) {
		Stack Obj = new Stack();
		Obj.push("Dad");
		Obj.push("MOM");
		Obj.push("Soahn");
		Obj.push("Hello");
		Obj.push("Hii");
		Obj.push("Hey");
		Obj.push(null);
		Obj.push(null);
		System.err.println(Obj.search(Obj));
		System.err.println(Obj.empty());
		System.err.println(Obj.peek());
		System.err.println(Obj.pop());
		System.err.println(Obj);

		Vector Obj1 = new Vector();
		Obj1.add("lucky");
		Obj1.add("lala");
		Obj1.add("lal");
		Obj1.add("komal");
		Obj1.add("deepak");
		Obj1.add("op");
		System.err.println(Obj.capacity());
		System.err.println(Obj.addAll(0, Obj1));
		System.err.println(Obj.contains("lala"));
		System.err.println(Obj.equals(Obj1));
		System.err.println(Obj.firstElement());
//		System.err.println(Obj.trimToSize());
		System.err.println(Obj1.elementAt(0));

	}

}
