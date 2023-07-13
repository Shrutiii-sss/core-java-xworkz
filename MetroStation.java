class MetroStation{

 static String stationNames[]={null,null,null,null,null,null,null};
 static int index;
 
 public static boolean addStation(String station){
	 boolean isCreated = false;
	 if(station!=null){
		 stationNames[index]=station;
		 index++;
		 isCreated = true;
	 }else{
		 System.out.println("Cannot store the value");
	 }
	 return isCreated;
 }
 
 public static void getAllStations(){
	 for(int station=0;station<stationNames.length;station++){
		 String reference = stationNames[station];
		 System.out.println("Accessing the station "+reference+" is "+station);
	 }
 }
}