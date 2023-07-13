class Zomato {
//implementation
 public static double search(String foodName){
  //"pizza"== "pizza"
     if("pizza" == foodName){
	 System.out.println("searched food name is" + foodName);
	 return 99.00;
	 }
	 if ("veg Biryani" == foodName){
	 return 245.90;
	 }
	   r
	System.out.println("searched food name is" + foodName);
    return 270.80;
	 }
	 
     if("Burger" == foodName){
     System.out.println("searched food name is" + foodName);
     return 104.50;
     }
	 
	 if("fried rice" == foodName){
     System.out.println("searched food name is" + foodName);
     return 99.50;
     }
	 
	 if("egg biryani" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.90;
     }
	 
	 if("chicken roll" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.60;
     }
	 
	 if("veg pulav" == foodName){
     System.out.println("searched food name is" + foodName);
     return 164.50;
     }
	 
	 if("Rice bath" == foodName){
     System.out.println("searched food name is" + foodName);
     return 99.00;
     }
	 
	 if("panner tikka" == foodName){
     System.out.println("searched food name is" + foodName);
     return 245.90;
     }
	 
	 if("french fries" == foodName){
     System.out.println("searched food name is" + foodName);
     return 174.80;
     }
	 
	 if("Hot chocolate" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.07;
     }
	 
	 if("vangi bath" == foodName){
     System.out.println("searched food name is" + foodName);
     return 200.09;
     }
	 
	 if("veg roll" == foodName){
     System.out.println("searched food name is" + foodName);
     return 209.06;
	 }
	 
	 if("dosa" == foodName){
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
	 
	 if("Fish fry" == foodName){
     System.out.println("searched food name is" + foodName);
     return 109.01;
     }
	 
	 return 0.0;
 }
	 //method overloading
	 public static double search (String foodName, int quantity){
		 //"pizza" == "pizza"
		 if("pizza" == foodName){
			 System.out.println("searched food Name is"+foodName);
			 return 99.00* quantity;
		 }
		 if ("veg Biryani" == foodName){
	 return 245.90*quantity;
	 }
	 
	 if("chicken tikka" == foodName){
	System.out.println("searched food name is" + foodName);
    return 270.80*quantity;
	 }
	 
     if("Burger" == foodName){
     System.out.println("searched food name is" + foodName);
     return 104.50*quantity;
     }
	 
	 if("fried rice" == foodName){
     System.out.println("searched food name is" + foodName);
     return 99.50*quantity;
     }
	 
	 if("egg biryani" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.90*quantity;
     }
	 
	 if("chicken roll" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.60*quantity;
     }
	 
	 if("veg pulav" == foodName){
     System.out.println("searched food name is" + foodName);
     return 164.50*quantity;
     }
	 
	 if("Rice bath" == foodName){
     System.out.println("searched food name is" + foodName);
     return 99.00*quantity;
     }
	 
	 if("panner tikka" == foodName){
     System.out.println("searched food name is" + foodName);
     return 245.90*quantity;
     }
	 
	 if("french fries" == foodName){
     System.out.println("searched food name is" + foodName);
     return 174.80*quantity;
     }
	 
	 if("Hot chocolate" == foodName){
     System.out.println("searched food name is" + foodName);
     return 199.07*quantity;
     }
	 
	 if("vangi bath" == foodName){
     System.out.println("searched food name is" + foodName);
     return 200.09*quantity;
     }
	 
	 if("veg roll" == foodName){
     System.out.println("searched food name is" + foodName);
     return 209.06*quantity;
	 }
	 
	 if("dosa" == foodName){
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
	 
	 if("Fish fry" == foodName){
     System.out.println("searched food name is" + foodName);
     return 109.01*quantity;
	 }
	 return 0.0;
		
  }
  }
