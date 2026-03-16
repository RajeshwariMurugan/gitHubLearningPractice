package Practice;

public class WaterBottle {
           byte quantity=2;
          final short orders=100;
          
          
	public static void main(String[] args) {
		WaterBottle wb = new WaterBottle(); // object creation
        System.out.println(wb.quantity);
        System.out.println(wb.orders);
        wb.can();        
 	}

	public void can() {
	   String name="Sowmiya";
	   int age=30;
	   System.out.println(name +" "+age);
   }
}
