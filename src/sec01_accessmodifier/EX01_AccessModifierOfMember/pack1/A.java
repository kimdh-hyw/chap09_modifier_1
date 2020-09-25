package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class A {
	public int a=1;
	protected int b=2;
	int c=3;
	private int d=4;
	
	public void print() { //a, b, c, d
		System.out.print(a+ " "); //가능
		System.out.print(b+ " "); //가능
		System.out.print(c+ " "); //가능
		System.out.print(d); //가능
		System.out.println();
	}
}
