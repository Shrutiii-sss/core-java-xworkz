class Swiggy {
  
  public static double search(String foodName){
  
     if("chicken shawarma" == foodName){
	 System.out.println("searched food name is" + foodName);
	 return 90.00;
	 }
	 if ("grill shawarma" == foodName){
	 return 180.90;
	 
     }
	 
	 if("kabab" == foodName){
	System.out.println("searched food name is" + foodName);
    return 270.80;
	 }
	 
     if("Burger" == foodName){
     System.out.println("searched food name is" + foodName);
     return 104.50;
     }
	 
	 if("fish tikka" == foodName){
     System.out.println("searched food name is" + foodName);
     return 220.50;
     }
	 
	 if("chicken biryani" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.90;
     }
	 
	 if("mutton kabab" == foodName){
     System.out.println("searched food name is" + foodName);
     return 195.60;
     }
	 
	 if("veg platter" == foodName){
     System.out.println("searched food name is" + foodName);
     return 300.50;
     }
	 
	 if("egg masala" == foodName){
     System.out.println("searched food name is" + foodName);
     return 140.00;
     }
	 
	 if("panner khurma" == foodName){
     System.out.println("searched food name is" + foodName);
     return 245.90;
     }
	 
	 if("murg masala" == foodName){
     System.out.println("searched food name is" + foodName);
     return 190.80;
     }
	 
	 if("mumos" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.07;
     }
	 
	 if("noodles" == foodName){
     System.out.println("searched food name is" + foodName);
     return 200.09;
     }
	 
	 if("manchurian " == foodName){
     System.out.println("searched food name is" + foodName);
     return 209.06;
	 }
	 
	 if("sweet corn manchurian" == foodName){
     System.out.println("searched food name is" + foodName);
     return 109.09;
     }
	 
	 if("chicken roll" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.01;
     }
	 
	 if("Bucket chicken" == foodName){
     System.out.println("searched food name is" + foodName);
     return 399.08;
	 }
	 
	 if("mushroom curry" == foodName){
     System.out.println("searched food name is" + foodName);
     return 209.09;
     }
	 
	 if(" veg tikka masala" == foodName){
     System.out.println("searched food name is" + foodName);
     return 299.09;
     }
	 
	 if("Kabab" == foodName){
     System.out.println("searched food name is" + foodName);
     return 265.05;
     }
	 return 0.00;
  }

	  //method overloading
	 public static double search(String foodName, int quantity){
     //"chicken shawarma" == "chicken shawarma"
     if("chicken shawarma" == foodName){
	 System.out.println("searched food name is" + foodName);
	 return 90.00*quantity;
	 }
	 if ("grill shawarma" == foodName){
	 return 180.90*quantity;
	 
     }
	 
	 if("kabab" == foodName){
	System.out.println("searched food name is" + foodName);
    return 270.80*quantity;
	 }
	 
     if("Burger" == foodName){
     System.out.println("searched food name is" + foodName);
     return 104.50*quantity;
     }
	 
	 if("fish tikka" == foodName){
     System.out.println("searched food name is" + foodName);
     return 220.50*quantity;
     }
	 
	 if("chicken biryani" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.90*quantity;
     }
	 
	 if("mutton kabab" == foodName){
     System.out.println("searched food name is" + foodName);
     return 195.60*quantity;
     }
	 
	 if("veg platter" == foodName){
     System.out.println("searched food name is" + foodName);
     return 300.50*quantity;
     }
	 
	 if("egg masala" == foodName){
     System.out.println("searched food name is" + foodName);
     return 140.00*quantity;
     }
	 
	 if("panner khurma" == foodName){
     System.out.println("searched food name is" + foodName);
     return 245.90*quantity;
     }
	 
	 if("murg masala" == foodName){
     System.out.println("searched food name is" + foodName);
     return 190.80*quantity;
     }
	 
	 if("mumos" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.07*quantity;
     }
	 
	 if("noodles" == foodName){
     System.out.println("searched food name is" + foodName);
     return 200.09*quantity;
     }
	 
	 if("manchurian " == foodName){
     System.out.println("searched food name is" + foodName);
     return 209.06*quantity;
	 }
	 
	 if("sweet corn manchurian" == foodName){
     System.out.println("searched food name is" + foodName);
     return 109.09*quantity;
     }
	 
	 if("chicken roll" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.01*quantity;
     }
	 
	 if("Bucket chicken" == foodName){
     System.out.println("searched food name is" + foodName);
     return 399.08*quantity;
	 }
	 
	 if("mushroom curry" == foodName){
     System.out.println("searched food name is" + foodName);
     return 209.09*quantity;
     }
	 
	 if(" veg tikka masala" == foodName){
     System.out.println("searched food name is" + foodName);
     return 299.09*quantity;
     }
	 
	 if("Kabab" == foodName){
     System.out.println("searched food name is" + foodName);
     return 265.05*quantity;
     }
	 return 0.00;
  }
  } 
	
	






