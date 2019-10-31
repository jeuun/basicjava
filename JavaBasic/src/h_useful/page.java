package h_useful;

public class page {

	public static void main(String[] args) {
		//String(String s)
		//String s = new String("HELLO");
		
		//System.out.println(s);
		
		//String(char[] value);
		
		/*char[] c ={'H','e','l','l','o'};
		String s = new String(c);
		
		System.out.println(s);*/
		
		/*StringBuffer sb = new StringBuffer("Hello");
		String s = new String(sb); 

		System.out.println(s);*/
		
		/*String s = "Hello";
		String n = "0123456";
		
		char c = s.charAt(1);
		char c2 = n.charAt(1);
		
		System.out.println(c);
		System.out.println(c2);*/
		
		/*int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);*/
		
		/*String s = "Hello";
		String s2 = s.concat("world");
		
		System.out.println(s);
		System.out.println(s2);*/
		
/*		String s = "abcedfg";
		boolean b = s.contains("bc");
		
		System.out.println(b);*/
		
/*		String file = "Hello.txt";
		boolean b = file.endsWith("txt"); 
		
		System.out.println(b);*/
		
/*		String  s = "Hello";
		
		boolean b = s.equalsIgnoreCase("Hello");
		boolean b2 = s.equalsIgnoreCase("hello");
		
		System.out.println(b);
		System.out.println(b2);
		
		int idx1 = s.indexOf('e',0);
		int idx2 = s.indexOf('e',2);
		
		System.out.println(idx1);
		System.out.println(idx2);*/
		
/*		String s = "ABCDEFG";
		int idx = s.indexOf("CD");
		
		System.out.println(idx); 
		*/
		
/*		String s = new String("abc");
		String s2 = new String("abc");
		boolean b = (s==s2);
		boolean b2 = s.equals(s2);
		boolean b3 = (s.intern() == s2.intern());
		
		System.out.println(b);
		System.out.println(b2);
		System.out.println(b3);*/
		
/*		String s = "java.lang.Object";
		int idx1 = s.lastIndexOf('.');
		int idx2 = s.indexOf('.');
		
		System.out.println(idx1);
		System.out.println(idx2);*/
		
/*		String s = "java.lang.java";
		int idx1 = s.lastIndexOf("java");
		int idx2 = s.indexOf("java");
		
		System.out.println(idx1);
		System.out.println(idx2);*/
		
/*		String s = "Hello";
		String s1 = s.replace('H','C');
		
		System.out.println(s);
		System.out.println(s1);*/
		
/*		String s = "Hellollo";
		String s1 = s.replace("ll","LL");
		
		System.out.println(s);
		System.out.println(s1);*/
		
/*		String ab = "AABBAABB";
		String r = ab.replaceAll("BB","bb");
		
		System.out.println(ab);
		System.out.println(r);*/
		
/*		String ab = "AABBAABB";
		String r = ab.replaceFirst("BB", "bb");
		
		System.out.println(r);*/
		
/*		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);*/
		
/*		String s = "java.lang.Object";
		boolean b = s.startsWith("java");
		boolean b2 = s.startsWith("lang");
		
		System.out.println(b);
		System.out.println(b2);*/
		
/*		String s = "java.lang.Object";
		String c = s.substring(10);
		String p = s.substring(5,9);

		System.out.println(c);
		System.out.println(p);*/
		
/*		String s = "Hello";
		String s1 = s.toLowerCase();
		
		System.out.println(s);
		System.out.println(s1);*/
		
/*		String s = "Hello";
		String s1 = s.toString();
		
		System.out.println(s1);*/
		
/*		String s = "Hello";
		String s1 = s.toUpperCase();
		
		System.out.println(s1);*/
		
/*		String s = "	Hello World		";
		String s1 = s.trim();
		
		System.out.println(s1);*/
		
		String b = String.valueOf(true);
		String c = String.valueOf('a');
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(date);
		
	}
}
