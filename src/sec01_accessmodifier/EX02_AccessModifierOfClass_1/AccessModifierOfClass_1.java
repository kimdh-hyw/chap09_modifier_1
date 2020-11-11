package sec01_accessmodifier.EX02_AccessModifierOfClass_1;

/*같은 패키지에서의 클래스 접근지정자 vs. 생성자 접근지정자*/

public class AccessModifierOfClass_1 {
	public static void main(String[] args) {		
		//#1. 객체 생성
		A a = new A(); //객체생성가능(A a) + 생성자 호출 가능(new A())
		B b = new B(); //객체생성가능(B b) + 생성자 호출 가능(new B())
		C c = new C(); //객체생성가능(C c) + 생성자 호출 가능(new C())		
	}
}
