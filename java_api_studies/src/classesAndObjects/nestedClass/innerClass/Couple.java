package classesAndObjects.nestedClass.innerClass;

/**
 * This class is an exemple of Nested Class (Inner Class) and the main method shows how to create an 
 * instance of an inner class using the outer class object
 * */
public class Couple {
	private String motherName;
	private String fatherName;
	
	public Couple(String motherName, String fatherName) {
		this.motherName = motherName;
		this.fatherName = fatherName;
	}
	
	private class Son{
		private String name;
		private int age;
		
		public Son(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public void introduceYouself() {
			System.out.println("Hi, I am " + this.name + " and I'm " + this.age + " years old");
		}
		
		public void introduceYourParents() {
			System.out.println("My mother is " + motherName + " and my father is " + fatherName);
		}
		
	}
	
	private class Daughter{
		private String name;
		private int age;
		
		public Daughter(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public void introduceYouself() {
			System.out.println("Hi, I am " + this.name + " and I'm " + this.age + " years old");
		}
		
		public void introduceYourParents() {
			System.out.println("My mother is " + motherName + " and my father is " + fatherName);
		}
	}
	
	public static void main(String[] args) {
		Couple couple = new Couple("Maria", "João");
		
		Couple.Son son = couple.new Son("José", 20);
		son.introduceYouself();
		son.introduceYourParents();
		
		System.out.println();
		
		Couple.Daughter daughter = couple.new Daughter("Ana", 19);
		daughter.introduceYouself();
		daughter.introduceYourParents();
	}

}










