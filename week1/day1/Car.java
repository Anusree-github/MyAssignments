package week1.day1;

public class Car {
       
	   public void applyBreak() {
		   System.out.println("Applied Break");
	   }
	   public void soundHorn() {
		   System.out.println("Sound Horn");
	   }
	   public static void main(String[]args) {
		   Bike honda = new Bike();
		        honda.applyBreak();
		        honda.soundHorn();
		   Bike tvs = new Bike();
		        tvs.applyBreak();
		        tvs.soundHorn();
	   }
			   
}


