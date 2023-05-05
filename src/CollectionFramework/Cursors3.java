package CollectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Cursors3 {

	public static void main(String[] args) {
            ///////Enumeration///////
		Stack Obj = new Stack();
		Obj.push("ROHIT");
		Obj.push("MOHIT");
		Obj.push("MUMMY");
		Obj.push("MOM");
		Obj.push("DAD");
		Obj.push("MOHAN");
		Obj.push("MONIKA"); 
		Enumeration enumeration = Obj.elements();
		while (enumeration.hasMoreElements()) {
			System.err.println(enumeration.nextElement());
		}
		System.out.println(Obj.search(Obj));

		/*Vector obj = new Vector();
		obj.add(10);
		obj.add("Ram");
		obj.add("Aman");
		obj.add("Deepak");
		obj.add(15.3);
//		System.out.println(obj);
		Enumeration enumeration1 = obj.elements();
		while (enumeration1.hasMoreElements()) {
			System.err.println(enumeration1.nextElement());*/
		
		////////Itertor/////////
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("Aman");
		arrayList.add("Bablu");
		arrayList.add("Boy");
		arrayList.add("Girl");
		arrayList.add("Goldi");
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add("Boy");
//		arrayList.add(3);
//		System.err.println(arrayList);
		Iterator<String> sIterator=arrayList.iterator();
		System.err.println(sIterator.next());
//		System.out.println(sIterator.remove());
		System.err.println(sIterator.hasNext());
		//////listItertor//////
		
		
		
		LinkedList<String> objLinkedList=new LinkedList<String>();
		objLinkedList.add("hello");
		objLinkedList.add("hii");
		objLinkedList.add("neelam");
		objLinkedList.add("neha");
		objLinkedList.add("seema");
		objLinkedList.add("suman");
		ListIterator<String> H=objLinkedList.listIterator(0);
		System.out.println(H.hasNext());
		System.err.println(H.previous());
		}

	}


