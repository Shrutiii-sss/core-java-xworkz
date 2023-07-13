class AC{
	

 static string  name = "hier";
 static int  minTemp ;
 static int currentTemp ;
 static int  maxTemp = 10 ;
  static boolean isConnected;
  
  public static boolean onOrOff(){
	  
	System.out.println("Invoking onOrOff()");
    System.out.println("Parameter"+ 0);	
	 if(isConnected == false){
         isConnected = true;
		 System.out.println("AC is Turned Onnn..");
	 }
	 else if(isConnected == true){
           isConnected = false ;
		 System.out.println("AC is Turned Off....");  
  }
  return isConnected;
  
   
  
  }
  
  //increaseTemp
  public static void increaseTemp(){
	  System.out.println("start of increaseTemp");
	  if(isConnected = true){
	if(currentTemp < maxTemp){
		    currentTemp = currentTemp + 1;
			System.out.println("The current Temp is" +currentTemp);
	}
	else{
		 System.out.println("Max Temp reached");
	}
  else{
	   System.out.println("AC on maadu firstu");
	  
  }  	  
  }
  else{
	  
  }
 
	  
 public static void  decreaseTemp(){
	 
      System.out.println("Invoking decreaseTemp()");
      System.out.println("list of parameters"+ 2);	  
	  if(isConnected == true){
	  if(currentTemp<=minTemp){
		  currentTemp = currentTemp-1;
		  System.out.println("The currentTemp is" +currentTemp);
	  }else{
		  System.out.println("min Temp reached");
	  }
  }else{
	  Sytem.out.println("AC is turned off..");
     }
	 }
  
  }