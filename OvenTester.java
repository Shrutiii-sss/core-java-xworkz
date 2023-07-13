class OvenTester{

public static  void main (String test[]){
       System.out.println("Main started");
	   Oven.name = "";
	   boolean connected= Oven.onOrOff();
	   system.out.println("Oven is connected"+connected);
	   Oven.onOrOff();
	   Oven.increaseTemp();
	   Oven.increaseTemp();
	   Oven.increaseTemp();
	   Oven.increaseTemp();
	   Oven.increaseTemp();
	   boolean connected1 = Oven.onOrOff();
	   system.out.println("Is Oven connected"+ connected1);
	   Oven.increaseTemp();
	   Oven.decreaseTemp();
	   System.out.println("Main ended");
	   Oven.decreaseTemp();
	   system.out.println("Main eneded");
	   
}
}
