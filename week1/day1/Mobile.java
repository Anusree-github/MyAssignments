package week1.day1;

public class Mobile {
	
       public void makeCall() {
	
	   String mobileModel = "iphone14";
	   float mobileWeight = 0.25f;
	   System.out.println("Mobile model:  "+ mobileModel);
	   System.out.println("Weight: " +mobileWeight);
	
}
       public void sendMsg() {
	
	   boolean FullCharged = true;
	   int mobileCost = 50000;
	   System.out.println("Condition: " +FullCharged);
	   System.out.println("Cost: " +mobileCost);
		
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
       Mobile apple = new Mobile();
       apple.makeCall();
       apple.sendMsg();
       System.out.println("This is my mobile");
       
}
}
