package ObjClassContrusto;

public class ABC {

	int a = 10;
	String bString = "nitu";

	void show() {
		System.out.println(a + " " + bString);
	}
}

class test {

	public static void main(String[] args) {

		ABC oAbc = new ABC();
		oAbc.show();
	}

}