package CollectionFramework;

import java.util.HashMap;

public class MapInterface {

	public static void main(String[] args) {

		HashMap Obj = new HashMap();
		Obj.put(100, "Aman");
		Obj.put(101, "Amod");
		Obj.put(102, "Nitu");
		Obj.put(103, "Ritu");
		Obj.put(104, "Anshika");
		Obj.put(104, "Anshika");
		System.out.println(Obj);
//		Obj.put(102, "Nitu");
		System.out.println(Obj.hashCode());
		System.out.println(Obj.containsValue("Ritu"));

		if (Obj.containsKey("Amod")) {
			System.err.println("Key is  parent in the map");
		} else {
			System.err.println("Key is not  parent in the map");
		}

		if (Obj.containsKey("Nitu")) {
			System.err.println("value is  parent in the map");
		} else {
			System.err.println("value is not  parent in the map");
		}

		if (Obj.containsKey(100)) {
			System.err.println("Key is  parent in the map");
		} else {
			System.err.println("Key is not  parent in the map");
		}

		if (Obj.containsKey("Nitu")) {
			System.err.println("value is  parent in the map");
		} else {
			System.err.println("value is not  parent in the map");
		}
	}

}
