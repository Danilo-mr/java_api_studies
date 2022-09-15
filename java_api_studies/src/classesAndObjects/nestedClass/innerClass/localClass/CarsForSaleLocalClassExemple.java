package classesAndObjects.nestedClass.innerClass.localClass;

public class CarsForSaleLocalClassExemple {

	public static void buyCar(String car) {
		
		class CarsForSale {
			private String[] availableCars = {"laFerrari", "Lotus Evija", "McLaren Senna", 
					"Bugatti Chiron", "Koenigsegg One", "McLaren Senna"};
			
			boolean isCarAvailable(String car){
				for(String availableCar : availableCars) {
					if(availableCar.equals(car)) {
						return true;
					}
				}
				return false;
			}
		
		}
		
		CarsForSale carsForSale = new CarsForSale();
		if(carsForSale.isCarAvailable(car)) {
			System.out.println("Buying...");
		} else {
			System.out.println("Sorry, this car is not available at this moment :(");
		}
		
	}
	
	public static void main(String[] args) {
		buyCar("laFerrari");
		buyCar("McLaren Senna");
		buyCar("Creta");
	}
}
