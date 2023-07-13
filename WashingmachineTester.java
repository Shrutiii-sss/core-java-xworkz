class WashingmachineTester{

public static  void main (String test[]){
       System.out.println("Main started");
	   Washingmachine.name = "";
	   boolean connected= Washingmachine.onOrOff();
	   system.out.println("Washingmachine is connected"+connected);
	   Washingmachine.onOrOff();
	   Washingmachine.increaseSpeed();
	   Washingmachine.increaseSpeed();
	   Washingmachine.increaseSpeed();
	   Washingmachine.increaseSpeed();
	   Washingmachine.increaseSpeed();
	   boolean connected1 = Washingmachine.onOrOff();
	   system.out.println("Is Washingmachine connected"+ connected1);
	   Washingmachine.increaseSpeed();
	   Washingmachine.decreaseSpeed();
	   System.out.println("Main ended");
	   Washingmachine.decreaseSpeed();
	   system.out.println("Main eneded");
	   
}
}