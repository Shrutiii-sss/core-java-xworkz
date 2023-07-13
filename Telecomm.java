class TeleComm{


 static String simNetworks[] = {null,null,null,null,null};
 static int index;

 public static boolean addSim(String sim){
	 boolean isCreated = false;
	 if(sim!=null){
		 simNetworks[index]=sim;
		 index++;
		 isCreated=true;
	 }else{
		 System.out.println("Cannot store the value");
	 }
	 return isCreated;
 }
 
 public static void getAllSimNetworks(){
	 for(int sim=0;sim<simNetworks.length;sim++){
		 String reference = simNetworks[sim];
		 System.out.println("Accessing the network "+ reference+" is "+sim);
	 }
 }
}
 