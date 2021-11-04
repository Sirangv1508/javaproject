package stringtypes;



public class stringexple {
	public static void main(String[] args) {
		String name ="siran";
		String name1 ="siran world";
		System.out.println("string:");
		int identityHashCode = System.identityHashCode(name);
		System.out.println(identityHashCode);
		int identityHashCode2 = System.identityHashCode(name1);
		System.out.println(identityHashCode2);
		String concat = name.concat(name1);
		System.out.println(concat);
		int identityHashCode3 = System.identityHashCode(concat);
		//string buBuffer
		System.out.println("stringbuffer");
		StringBuffer a= new StringBuffer("siran");
		StringBuffer b=new StringBuffer("sirangv");
		int identityHashCode4 = System.identityHashCode(a);
		System.out.println(identityHashCode4);
		int identityHashCode5 = System.identityHashCode(b);
		System.out.println(identityHashCode5);
		StringBuffer append = a.append(b);
		System.out.println(append);
		int identityHashCode6 = System.identityHashCode(append);
		System.out.println(identityHashCode6);
		//string builder
		
		StringBuilder c=new StringBuilder("siran");
		
		StringBuilder t=new StringBuilder("sirangv");
		int identityHashCode7 = System.identityHashCode(c);
		System.out.println(identityHashCode7);
		int identityHashCode8 = System.identityHashCode(t);
		System.out.println(identityHashCode5);
		StringBuilder append1= c.append(t);
		System.out.println(append1);
		int identityHashCode9= System.identityHashCode(append);
		System.out.println(identityHashCode9);
		
		
		
		
	}

}
