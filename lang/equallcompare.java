package lang;

public class equallcompare {

	public static void main(String[] args) {
		String s1=new String("Gagan");
		String s2=new String("Gagan");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("___________________________________");
		StringBuffer s3=new StringBuffer("Gagan");
		StringBuffer s4=new StringBuffer("Gagan");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
//string buffer only object level its compare object reference
//