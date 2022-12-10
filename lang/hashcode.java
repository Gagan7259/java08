package lang;

public class hashcode {

	public static void main(String[] args) {
		String s1 = new String("gagan");
		String s2 = new String("gagan");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		StringBuffer s3 = new StringBuffer("gagan");
		StringBuffer s31 = new StringBuffer("gagan");
		System.out.println(s31.equals(s31));
	}

}
