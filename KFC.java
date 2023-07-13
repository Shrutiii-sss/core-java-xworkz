class KFC{
  
  public static double search(String foodName){
  
     if("mingles bucket" == foodName){
	 System.out.println("searched food name is" + foodName);
	 return 249.00;
	 }
	 if ("bucket meal" == foodName){
	 return 469.90;
	 
     }
	 
	 if("friendship bucket" == foodName){
	System.out.println("searched food name is" + foodName);
    return 616.80;
	 }
	 
     if("smooky grilled" == foodName){
     System.out.println("searched food name is" + foodName);
     return 365.50;
     }
	 
	 if("dips bucket" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.50;
     }
	 
	 if("chicken ginger" == foodName){
     System.out.println("searched food name is" + foodName);
     return 150.90;
     }
	 
	 if("popcorn chicken" == foodName){
     System.out.println("searched food name is" + foodName);
     return 165.60;
     }
	 
	 if("krunchy burger" == foodName){
     System.out.println("searched food name is" + foodName);
     return 164.50;
     }
	 
	 if("veg stripes" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.00;
     }
	 
	 if("chicken sandwich" == foodName){
     System.out.println("searched food name is" + foodName);
     return 245.90;
     }
	 
	 if("french fries" == foodName){
     System.out.println("searched food name is" + foodName);
     return 174.80;
     }
	 
	 if("mushed potato " == foodName){
     System.out.println("searched food name is" + foodName);
     return 101.07;
     }
	 
	 if("chicken boneless" == foodName){
     System.out.println("searched food name is" + foodName);
     return 200.09;
     }
	 
	 if("chicken bites" == foodName){
     System.out.println("searched food name is" + foodName);
     return 209.06;
	 }
	 
	 if("" =large popcorn= foodName){
     System.out.println("searched food name is" + foodName);
     return 100.09;
     }
	 
	 if("chicken roll" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.01;
     }
	 
	 if("Bucket chicken" == foodName){
     System.out.println("searched food name is" + foodName);
     return 399.08;
	 }
	 
	 if("boneless stripes" == foodName){
     System.out.println("searched food name is" + foodName);
     return 249.09;
     }
	 
	 if("hot wings" == foodName){
     System.out.println("searched food name is" + foodName);
     return 299.09;
     }
	 
	 if("chicken kebab" == foodName){
     System.out.println("searched food name is" + foodName);
     return 265.05;
     }
	 
    return 0.00;
  }
	 
	 
	 
	 //method overloading
	  public static double search(String foodName, int quantity){
      //"mingles bucket" == "mingles bucket"
     if("mingles bucket" == foodName){
	 System.out.println("searched food name is" + foodName);
	 return 249.00*quantity;
	 }
	 if ("bucket meal" == foodName){
	 return 469.90*quantity;
	 
     }
	 
	 if("friendship bucket" == foodName){
	System.out.println("searched food name is" + foodName);
    return 616.80*quantity;
	 }
	 
     if("smooky grilled" == foodName){
     System.out.println("searched food name is" + foodName);
     return 365.50*quantity;
     }
	 
	 if("dips bucket" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.50*quantity;
     }
	 
	 if("chicken ginger" == foodName){
     System.out.println("searched food name is" + foodName);
     return 150.90*quantity;
     }
	 
	 if("popcorn chicken" == foodName){
     System.out.println("searched food name is" + foodName);
     return 165.60*quantity;
     }
	 
	 if("krunchy burger" == foodName){
     System.out.println("searched food name is" + foodName);
     return 164.50*quantity;
     }
	 
	 if("veg stripes" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.00*quantity;
     }
	 
	 if("chicken sandwich" == foodName){
     System.out.println("searched food name is" + foodName);
     return 245.90*quantity;
     }
	 
	 if("french fries" == foodName){
     System.out.println("searched food name is" + foodName);
     return 174.80*quantity;
     }
	 
	 if("mushed potato " == foodName){
     System.out.println("searched food name is" + foodName);
     return 101.07*quantity;
     }
	 
	 if("chicken boneless" == foodName){
     System.out.println("searched food name is" + foodName);
     return 200.09*quantity;
     }
	 
	 if("chicken bites" == foodName){
     System.out.println("searched food name is" + foodName);
     return 209.06*quantity;
	 }
	 
	 if("" =large popcorn= foodName){
     System.out.println("searched food name is" + foodName);
     return 100.09*quantity;
     }
	 
	 if("chicken roll" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.01*quantity;
     }
	 
	 if("Bucket chicken" == foodName){
     System.out.println("searched food name is" + foodName);
     return 399.08*quantity;
	 }
	 
	 if("boneless stripes" == foodName){
     System.out.println("searched food name is" + foodName);
     return 249.09*quantity;
     }
	 
	 if("hot wings" == foodName){
     System.out.println("searched food name is" + foodName);
     return 299.09*quantity;
     }
	 
	 if("chicken kebab" == foodName){
     System.out.println("searched food name is" + foodName);
     return 265.05*quantity;
     }
	  return 0.00;
  }
}