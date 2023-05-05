package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListALVS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList Obj=new ArrayList();
		Obj.add("Aman");
		Obj.add("Nitu");
		Obj.add("RituNeelam");
		Obj.add("Suresh");
		Obj.add("Ram");
		Obj.add(null);
		Obj.add(null);
		System.out.println(Obj);
		System.out.println(Obj.clone());
		System.out.println(Obj.isEmpty());
		System.err.println(Obj.containsAll(Obj));
		System.err.println(Obj.remove("Amna"));
		System.out.println(Obj.hashCode());
		System.out.println(Obj.get(0));
		System.err.println(Obj.equals("Ram"));
		
		List Obj1=new ArrayList();
		Obj1.add("Rakesh");
		Obj1.add("Vivek");
		Obj1.add("Rohan");
		Obj1.add("Mohan");
		Obj1.add("Deepak");
		Obj1.add(null);
		Obj1.add(null);
		System.out.println(Obj1);
		System.out.println(Obj1.size());
		System.out.println(Obj1.retainAll(Obj1));
		System.out.println(Obj1.toArray());
		System.out.println(Obj1.lastIndexOf(4));
		System.out.println(Obj1.indexOf(Obj1));
		System.out.println(Obj1.removeAll(Obj1));
//		System.out.println(Obj1.subList(0,2));
//		System.out.println(Obj1.replaceAll(Obj1));
		System.out.println(Obj1.iterator());
		
		Collection obj2=new ArrayList() ;
		obj2.add("Sohan");
		obj2.add("Soni");
		obj2.add("Sani");
		obj2.add("Sonam");
		obj2.add("Suman");
		obj2.add(null);
		obj2.add(null);
		obj2.add(null);
		System.err.println(obj2);
		System.out.println(obj2.remove(obj2));
		System.out.println(obj2.hashCode(   ));
		
//		Collection obj3=new LinkedList() ;
			LinkedList obj3=new LinkedList();
		obj3.add("Deepka");
		obj3.add("Deepka");
		obj3.add("Deepka");
		obj3.add("Deepka");
		obj3.add("Deepka");
		obj3.add("Deepka");
		obj3.add("Deepka");
		System.err.println(obj3);
		System.out.println(obj3.get(0));
		System.out.println(obj3.getLast());
		System.err.println(obj3.peek());
		System.out.println(obj3.poll());
		System.out.println(obj3.peekFirst());
		System.err.println(obj3.remove());
		System.out.println(obj3.removeFirst());
		System.err.println(obj3.removeAll(obj3));
		System.err.println(obj3.offerFirst(obj3));
//		System.err.println(obj3.push(obj3));
		System.err.println(obj3.toArray());
//		System.err.println(obj3.clear());
		}
	}
