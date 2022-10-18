public class Main
{
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer i1 = Integer.valueOf(i);
		Double d = Double.valueOf(10.5);
		Boolean b = Boolean.valueOf("vamshi");
		Character a = Character.valueOf('a');
		System.out.println(i);
		System.out.println(i1);
		System.out.println(d);
		System.out.println(b);
		System.out.print(a);
	}
}

Output:
10
10
10.5
false
a
