class Television{
	

 static string  name = "sony";
 static int  minVolume ;
 static int currentVolume ;
 static int  maxVolume = 10 ;
  static boolean isConnected;
  //method 
  public static boolean onOrOff(){
	  
	System.out.println("Invoking onOrOff()");
    System.out.println("Parameter"+ 0);
    //true==false	
	 if(isConnected == false){
         isConnected = true;
		 System.out.println("Television is Turned Onnn.. Enjoyyy");
		 //true==true
	 }
	 else if(isConnected == true){
           isConnected = false ;
		 System.out.println("Television is Turned Off....");  
  }
  return isConnected;
  
   
  
  }
  
  //increaseVolume
  public static void increaseVolume(){
	  system.out.println("start of increaseVolume");
	  if(isConnected = true){
	if(currentVolume < maxVolume){
		    currentVolume = currentVolume + 1;
			System.out.println("The current Volume is" +currentVolume);
	}else{
		 System.out.println("Max Volume reached");
	}
  }else{
	   System.out.println("");
	  
  }  
	  
  }else{
	  
  }
 
	  
 public static void  decreaseVolume(){
	 
	  //logic
      system.out.println("Invoking decreaseVolume()");
      system.out.println("list of parameters"+ 0);	  
	  if(isConnected == true){
	  if(currentVolume<=minVolume){
		  currentVolume = currentVolume-1;
		  system.out.println("The currentVolume is" +currentVolume);
	  }else{
		  system.out.println("min Volume reached");
	  }
  }else{
	  sytem.out.println("Television is turned off...can't decrease Volume");
     }
  system.out.println("End of decreaseVolume()");
   }
   
  }
  }