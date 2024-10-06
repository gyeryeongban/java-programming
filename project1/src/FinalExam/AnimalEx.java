package FinalExam;

public class AnimalEx {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		Tiger t = new Tiger();
		Animal ac = new Cat();
		Cat cc = (Cat) ac;
		System.out.println(a instanceof Animal);
		System.out.println(d instanceof Dog);
		System.out.println(t instanceof Cat);
		System.out.println(ac instanceof Animal);
		System.out.println(cc instanceof Tiger);
	}

}
