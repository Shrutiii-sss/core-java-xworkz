class Mixer1{
	

 static String  name = "butterfly";
 static int  minSpeed ;
 static int currentSpeed ;
 static int  maxSpeed = 10 ;
  static boolean isConnected;
  //method 
  public static boolean onOrOff(){
	  
	System.out.println("Invoking onOrOff()");
    System.out.println("Parameter"+ 0);	
	 if(isConnected == false){
         isConnected = true;
		 System.out.println("Mixer is Turned Onnn..");
	 }
	 else if(isConnected == true){
           isConnected = false ;
		 System.out.println("Mixer is Turned Off....");  
  }
  return isConnected;
  
   
  
  }
  
  //increaseSpeed
  public static void increaseSpeed(){
	  System.out.println("start of increaseSpeed()");
	  if(isConnected = true){
	if(currentSpeed < maxSpeed){
		    currentSpeed = currentSpeed + 1;
			System.out.println("The current Speed is" +currentSpeed);
	}
	else{
	System.out.println("Max Speed reached");
	}
  }else{
	   System.out.println("Mixer on maadu firstu");
	  
  }
  }
 
	//decrease Speed  
 public static void  decreaseSpeed(){
	 
      System.out.println("Invoking decreaseSpeed()");
      System.out.println("list of parameters"+ 2);	  
	  if(isConnected = true){
	  if(currentSpeed<=minSpeed){
		  currentSpeed = currentSpeed-1;
		  System.out.println("The currentSpeed is" +currentSpeed);
	  }
	  else{
		  System.out.println("min Speed reached");
	  }
      }
   else{
	  System.out.println("Mixer1 on maadu firstu");
     }
	 }
   
  }
  