package sec01_accessmodifier.EX01_AccessModifierOfMember;

/*멤버 및 생성자에 적용되는 네 가지 접근 지정자*/

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;
import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.B;
import sec01_accessmodifier.EX01_AccessModifierOfMember.pack2.C;
import sec01_accessmodifier.EX01_AccessModifierOfMember.pack2.D;

public class AccessModifierOfMember {
	public static void main(String[] args) {		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();
	}
}

