class StationaryTester{

  public static void main(String tester[]){
  
       // create,save,add
       Stationary.addStationaryItems("Books");
	   Stationary.addStationaryItems("Pencil");
       Stationary.addStationaryItems("Pen");
       Stationary.addStationaryItems("Scale");
       Stationary.addStationaryItems("Whitner");
	   Stationary.addStationaryItems("Ink pen");
       Stationary.addStationaryItems("Sketch pen");
	   Stationary.addStationaryItems("Charts");
	   //read ,get,fetch
	   Stationary.getAllStationaryItems();
	   // ftch the specific item name
	   String sName= Stationary.searchStationaryItembyName("Pencil");
	   System.out.println("The item name is" +sname);
	   System.out.println(" ");
	   //update,edit
	   Stationary.editStationaryItemName( "Cardboard sheets" , "Sketch pen");
	   Stationary.getAllStationaryItem();
	   int newLength = Stationary.deleteStationaryItemName("Ink pen");
	   System.out.println("Calling getAllStationaryItempostDeletion");
	   Stationary.getAllStationaryItemspostDeletion(newLength);
	   
  }
	   
	   
  }
 





