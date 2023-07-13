class TravelAgency{
 
 static String touristPlaces[] = {null,null,null,null,null,null,null,null};
 static int index;
 
 public static boolean addPlaces(String place){
	 boolean isCreated = false;
	 if(place!=null){
		 touristPlaces[index]=place;
		 index++;
		 isCreated=true;
	 }else{
		 System.out.println("Cannot store the value");
	 }
	 return isCreated;
 }


  public static void getAllPlaces(){
	  for(int place=0;place<touristPlaces.length;place++){
		  String reference = touristPlaces[place];
		  System.out.println("Accessing the place "+reference+" is "+place);
	  }
  }
}