package ch06;

public class Ex12_Car {

		public Ex12_Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

		String company;
		String model;
		String color;
		int maxSpeed;
	
		void printField() {
		System.out.println(this.company + ", " + this.model + ", "+ 
				this.color + ", " + this.maxSpeed);
	}

}
