class Washingmachine{
	

 static string  name = "LG";
 static int  minSpeed ;
 static int currentSpeed ;
 static int  maxSpeed = 10 ;
  static boolean isConnected;
  //method 
  public static boolean onOrOff(){
	  
	System.out.println("Invoking onOrOff()");
    System.out.println("Parameter"+ 0);
    //true==false	
	 if(isConnected == false){
         isConnected = true;
		 System.out.println("Washingmachine is Turned Onnn.. Enjoyyy");
		 //true==true
	 }
	 else if(isConnected == true){
           isConnected = false ;
		 System.out.println("Washingmachine is Turned Off....");  
  }
  return isConnected;
  
   
  
  }
  
  //increaseSpeed
  public static void increaseSpeed(){
	  system.out.println("start of increaseSpeed");
	  if(isConnected = true){
	if(currentSpeed < maxSpeed){
		    currentSpeed = currentSpeed + 1;
			System.out.println("The current Speed is" +currentSpeed);
	}else{
		 System.out.println("Max Speed reached");
	}
  }else{
	   System.out.println("");
	  
  }  
	  
  }else{
	  
  }
 
	  
 public static void  decreaseSpeed(){
	 
	  //logic
      system.out.println("Invoking decreaseSpeed()");
      system.out.println("list of parameters"+ 0);	  
	  if(isConnected == true){
	  if(currentSpeed<=minSpeed){
		  currentSpeed = currentSpeed-1;
		  system.out.println("The currentSpeed is" +currentSpeed);
	  }else{
		  system.out.println("min Speed reached");
	  }
  }else{
	  sytem.out.println("Washingmachine is turned off...can't decrease Speed");
     }
  system.out.println("End of decreaseSpeed()");
   }
   
  }
  }