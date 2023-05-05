package SingletonClass;

import java.util.jar.Manifest;

public class SampleClass {

	private static SampleClass isobjClass = null;

	private SampleClass() {
		// --------------------
		/// ----------------------
	}

	public static SampleClass getobject() {
		if (isobjClass == null) {
			isobjClass = new SampleClass();

		}
		return isobjClass;
	}

	public static void main(String[] args) {

	}

}
class ABC{
	public static void main(String[] args) {
		System.err.println(SampleClass.getobject());
		System.err.println(SampleClass.getobject());
		System.err.println(SampleClass.getobject());
	}
}