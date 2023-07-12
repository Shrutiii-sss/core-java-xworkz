class Stationary{
    static String stationaryItems[] = {null, null,null,null,null,null,null,null};
    static int index = 0;
       public static boolean addStationaryItems(String itemName){
	   System.out.println("Invoking addStationaryItems");
	   System.out.println("No of parameters : 1,type of parameter :String");
	   boolean isAdded = false;
	   if(itemName !=null){
	         if(index<stationaryItems.length) 
		stationaryItem [index++] = itemName;
		isAdded = true;
		
	}else{
	System.out.println("oh ....Elli jaaga full agide");
	}
	   }
	}else{
	System.out.println("ItemName cannot be null");
	}
	return isAdded;
	}
	
	public static void getAllStationaryItems(){
	System.out.println("itemName");
	}
	    
	
	public static int  deleteStationaryItemName(String deletedItemName){
	System.out.println("Invoking addStationaryItems");
	   System.out.println("No of parameters : 2,type of parameter :String,String");
	   boolean isDeleted = false;
	   for(int itemIndex = 0; itemIndex<stationaryItem.length; itemIndex++){
	   
	   if(stationaryItems[itemIndex].equals(deletedItemName ){
  
            StationaryItems[itemIndex] = null;
			isDeleted = true;
	   }
		}
		return isDeleted;
		
	
}

//return specific item name(String)
public static String getStationaryItemByName(String itemName){
	System.out.println("Invoking  getStationaryItemByName");
	System.out.println("No of parameter : 1,type String");
	String sName = null;
	foe(String name : stationaryItem){
		
		//"Ink pen".equals("Ink Pen")
		if(name.equals(itemName)){
			sNamw = name;
			System,ouyprintln(i
			temname founf")'
			
		}
	}
	return sName ;


























	   