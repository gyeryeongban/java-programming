package FinalExam;

public class B {

	public static void main(String[] args) {
		AccessModifierExample obj = new AccessModifierExample();
		obj.printVars(); // (5)
		System.out.println("Private Var: " + obj.privateVar); // (6)
		System.out.println("Protected Var: " + obj.protectedVar); // (7)
		System.out.println("Public Var: " + obj.publicVar); // (8)
		System.out.println("Default Var: " + obj.defaultVar); // (9)
	}

}
