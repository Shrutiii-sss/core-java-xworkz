class Oven{
	

 static string  name = "bajaj";
 static int  minTemp ;
 static int currentTemp ;
 static int  maxTemp = 10 ;
  static boolean isConnected;
  //method 
  public static boolean onOrOff(){
	  
	System.out.println("Invoking onOrOff()");
    System.out.println("Parameter"+ 0);
    //true==false	
	 if(isConnected == false){
         isConnected = true;
		 System.out.println("Oven is Turned Onnn.. Enjoyyy");
		 //true==true
	 }
	 else if(isConnected == true){
           isConnected = false ;
		 System.out.println("Oven is Turned Off....");  
  }
  return isConnected;
  
   
  
  }
  
  //increaseTemp
  public static void increaseTemp(){
	  system.out.println("start of increaseTemp");
	  if(isConnected = true){
	if(currentTemp < maxTemp){
		    currentTemp = currentTemp + 1;
			System.out.println("The current Temp is" +currentTemp);
	}else{
		 System.out.println("Max Temp reached");
	}
  }else{
	   System.out.println("");
	  
  }  
	  
  }else{
	  
  }
 
	  
 public static void  decreaseTemp(){
	 
	  //logic
      system.out.println("Invoking decreaseTemp()");
      system.out.println("list of parameters"+ 0);	  
	  if(isConnected == true){
	  if(currentTemp<=minTemp){
		  currentTemp = currentTemp-1;
		  system.out.println("The currentTemp is" +currentTemp);
	  }else{
		  system.out.println("min Temp reached");
	  }
  }else{
	  sytem.out.println("Oven is turned off...can't decrease Temp");
     }
  system.out.println("End of decreaseTemp()");
   }
  
  }