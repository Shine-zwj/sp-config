package test;

public class Test {
	public static void main(String[] args) {
		int n = 127;
		Integer n0 = 127;
		Integer n1 = 127;
		Integer n2 = Integer.valueOf(127);
		System.out.println(n0==n1);
		System.out.println(n1==n2);
		System.out.println(n0==n2);
		System.out.println(n==n0);
		Integer n3 = new Integer(127);
		Integer n4 = new Integer(127);
		System.out.println(n==n3);
		System.out.println(n0==n3);
		System.out.println(n3==n4);
		
		System.out.println("==========================");
		
		int m = 128;
		Integer m0 = 128;
		Integer m1 = 128;
		Integer m2 = Integer.valueOf(128);
		System.out.println(m0==m1);
		System.out.println(m1==m2);
		System.out.println(m0==m2);
		System.out.println(m==m0);
		Integer m3 = new Integer(128);
		Integer m4 = new Integer(128);
		System.out.println(m==m3);
		System.out.println(m0==m3);
		System.out.println(m3==m4);
	}
}
