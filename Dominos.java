class Dominos{
public static double search(String foodName){
     if("Corn Pizza" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 150.00;
	 }
	 if("Margherita" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 239.00;
	 }
	 if("Fungi Gourmet Pizza" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 699.00;
	 }
	 if("Cheese Pratha Pizza" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 179.90;
	 }
	 if("Capres Gourmet Pizza" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 699.00;
	 }
	 if("Cheese Pizza" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 209.00;
	 }
	 if("Mexican Green Wave" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 459.90;
	 }
	 if("Tamoto Pizza" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 350.00;
	 }
	 if("Chilli " == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 120.00;
	 }
	 if("Pepper Barbecue Chicken" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 449.00;
	 }
	 if("Chicken Pepperoni" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 599.00;
	 }
	 if("Chicken Tikka" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 600.00;
	 }
	 if("Chicken Fiesta" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 560.00 ;
	 }
	 if("Pasta Pizza" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 500.00;
	 }
	 if("Chicken Maximus" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 700.00;
	 }
	 if("Chicken Sausage" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 370.00;
	 }
	 if("Chicken Parcel" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 60.00;
	 }
	 if("Chicken Blazing & Paprika" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 500.00 ;
	 }
	 if("Peppar Barbecue" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 450.00;
	 }
	 if("Paneer Pizza" == foodName){
	 System.out.println("Searched food name is" +foodName);
	 return 280.00;
	 }
	 return 0.0;
}
	 


}

//Method Overloading
 
 public static double search(String foodName , int quantity){
 
  if("Coke" == foodName){
   System.out.println("Searched foodName is "+ foodName);
   return 69.00 * quantity;
  }
  if("Pepsi" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 399.90 * quantity;
  }
  if("Garlic Breadsticks" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 109.0 * quantity;
  }
  if("Choco Lava Cake" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 149.0 * quantity;
  }
  if("Classic stuffed garlic bread" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.0 * quantity;
  }
  if("Panner Tikka stuffed garlic bread" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 169.0 * quantity;
  }
  if("Chicken pepperoni stuffed garlic bread" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 169.0 * quantity;
  }
  if("Taco Mexican Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Taco Mexican Non Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 8169.0 * quantity;
  }
  if("Chicken Parcel" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 55.0 * quantity;
  }
  if("Mushroom Parcel" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.0 * quantity;
  }
  if("Potato Cheesy Shots" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 79.0 * quantity;
  }
  if("Crunchy Strips" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 69.0 * quantity;
  }
  if("Creamy Tomato Pasta veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Cheesy Jalapeno Pasta veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Tikka Masala Pasta Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Moroccan Spice Pasta Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 139.0 * quantity;
  }
  if("Creamy Tomato Pasta Non Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 149.0 * quantity;
  }
  if("Cheesy Jalapeno Pasta non-veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 149.0 * quantity;
  }
  if("Moroccan Spice Pasta Non-Veg" == foodName){
  System.out.println("The seached foodName is "+ foodName);
  return 159.0 * quantity;
  }
  return 0.0;
 }

}