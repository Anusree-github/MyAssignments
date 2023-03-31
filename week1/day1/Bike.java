package week1.day1;

public class Bike {
	
	public void applyBreak() {
		System.out.println("Applied Break");
	}
    public void soundHorn() {
    	System.out.println("Sound Horn");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Car hyundai = new Car();
               hyundai.applyBreak();
               hyundai.soundHorn();
           Car yamaha = new Car();
               yamaha.applyBreak();
               yamaha.soundHorn();
      }

}
