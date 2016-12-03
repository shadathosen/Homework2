package stringClass;

public class StringMethods {

	public static void main(String[] args) {
		String name = "shadat hoshen";
		String hello = ("hello from sha and atlantic city");
		String subject = ("my favorite subject is history");
		
		
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		
		System.out.println(hello.charAt(7));
		System.out.println(hello.codePointAt(2));
		System.out.println(hello.compareTo(name));
		System.out.println(hello.chars());
		
		System.out.println(hello.codePointBefore(0));
		System.out.println(hello.codePointCount(5, 23));
		System.out.println(hello.substring(12));
		
		System.out.println(subject.valueOf(hello));	
		
		
	}
	

}
