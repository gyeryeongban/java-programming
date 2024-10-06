package FinalExam;

class A {
	private int privateVar = 10;
	protected int protectedVar = 20;
	public int publicVar = 30;
	int defaultVar = 40;
	public void printVars() {
		System.out.println("Private Var: " + privateVar); // (1)
		System.out.println("Protected Var: " + protectedVar); // (2)
		System.out.println("Public Var: " + publicVar); // (3)
		System.out.println("Default Var: " + defaultVar); // (4)
	}
}
