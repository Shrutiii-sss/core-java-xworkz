class TelevisionTester{

public static  void main (String test[]){
       System.out.println("Main started");
	   Television.name = "";
	   boolean connected= Television.onOrOff();
	   system.out.println("Television is connected"+connected);
	   Television.onOrOff();
	   Television.increaseVolume();
	   Television.increaseVolume();
	   Television.increaseVolume();
	   Television.increaseVolume();
	   Television.increaseVolume();
	   boolean connected1 = Television.onOrOff();
	   system.out.println("Is Television connected"+ connected1);
	   Television.increaseVolume();
	   Television.decreaseVolume();
	   System.out.println("Main ended");
	   Television.decreaseVolume();
	   system.out.println("Main eneded");
	   
}
}