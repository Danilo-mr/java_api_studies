package classesAndObjects.nestedClass.innerClass.anonymousClass;

public class DifferentLanguagesPrintsAnonymousClassExemple {
	
	interface HelloWorld {
		public void print();
		public void printWithSomething(String something);
	}
	
	public void sayHelloInDifferentLanguages() {
		
		class CPlusPlusOutput implements HelloWorld{
			
			private final String LANGUAGE = "C++";
			
			public void print( ) {
				System.out.println(this.LANGUAGE + "\tcout << \"Hello\"");
			}
			
			public void printWithSomething(String something) {
				System.out.println(this.LANGUAGE + "\tcout << \"Hello\" " + something);
			}
		}
		
		HelloWorld cPlusPlusPrinting = new CPlusPlusOutput();
		cPlusPlusPrinting.print();
		
		HelloWorld javaPrinting = new HelloWorld() {
			
			private final String LANGUAGE = "JAVA";
			
			public void print() {
				System.out.println(this.LANGUAGE + "\tSystem.out.println(\"Hello\"");
			}
			
			public void printWithSomething(String something) {
				System.out.println(this.LANGUAGE + "\tSystem.out.println(\"Hello\" " + something);
			}
			
		};
		
		javaPrinting.printWithSomething("Java World");
	}
	
	public static void main(String[] args) {
		DifferentLanguagesPrintsAnonymousClassExemple myApp = new DifferentLanguagesPrintsAnonymousClassExemple();
		myApp.sayHelloInDifferentLanguages();
	}
}
