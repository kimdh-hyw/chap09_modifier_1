package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A{ //D 클래스는 A 클래스의 자식 클래스이다.
	
	public void print() { //a, b, c, d
		
		//#멤버 활용
		System.out.print(a+ " "); //가능
		System.out.print(b+ " "); //가능
		//System.out.print(c+ " "); //불가능
		//System.out.print(d); //불가능
		System.out.println();
	}
}
