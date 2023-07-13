class Medicalstore{


 static String medicineNames[] = {null,null,null,null,null,null,null,null,null};
  static int index;
  
public static boolean addMedicines(String medicine){     
boolean isAdded = false;

if(medicine != null){
medicineNames[index] = medicine;               
index++;
isAdded = true;
}else{
System.out.println("Cann't get the Medicine names as it is a null");

}
return isAdded;     
      }                             
                    
public static void getAllMedicineNames(){

for(int medicine=0; medicine<medicineNames.length; medicine++){
	String reference = medicineNames[medicine];
	System.out.println("Access medicines " + reference + " at " +medicine);
}
System.out.println("End getAllMedicineNames");

}
}																																																																																																																		