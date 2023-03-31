package week1.day1;

public class Tab {

	   public int tabPrice(int tabPrice){
		   return tabPrice;
}
	   
	   public String tabBrand(String brandName){
		   return brandName;
		   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Tab redmi = new Tab();
           String brandName = redmi.tabBrand("Xiaomi");
           int tabPrice = redmi.tabPrice(25697);
           System.out.println(brandName);
           System.out.println(tabPrice);
           
               
}

}
