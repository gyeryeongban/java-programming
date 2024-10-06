package FinalExam;

public class ThisExample {
	int var;
	
	public ThisExample() {
		this.var = 10;
	}
	
	public ThisExample(int var) {
		this.var = var;
	}
	
	public void printVar() {
		System.out.println(this.var);
	}

	public static void main(String[] args) {
		ThisExample obj_1 = new ThisExample();
		ThisExample obj_2 = new ThisExample(50);
		obj_1.printVar();
		obj_2.printVar();
	}

}
