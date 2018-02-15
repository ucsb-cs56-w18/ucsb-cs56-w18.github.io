public class TraderBobs {

  public static void TB01 () {
	  //Edible o = new Beverage(89,"Diet Coke",0,12.0);
	  //System.out.println("o: " + o.getFluidOunces());
  }

	public static void TB02 () {
		//Edible t = new FreeCandy(30);
		//System.out.println("t: " + t.getPrice());
	}

  public static void TB03 () {
    Beverage m = new Beverage(99,"Coke",150,12.0);
    System.out.println("m: " + m.getCalories());
  }

  public static void TB04 () {
	  // FreeCandy s = new FreeCandy(25);
	  // System.out.println("s: " + s.getName());
  }
	
  public static void TB05 () {
	  //  Edible q = new Edible(149,"Snickers",245,1.56);
	  // System.out.println("q: " + q.getCalories());
  }

  public static void TB06 () {
       Food r = new Food(99,"Almonds",100,0.63);
       System.out.println("r: " + r.getName());
  }

	public static void TB07 () {
     Edible p = new Food(249,"Kind Bar",200,1.4);
     System.out.println("p: " + p.getCalories());	
  }

	public static void TB08 () {
		// Beverage n = new Edible(199,"Gummi Bears",520,5);
		// System.out.println("n: " + n.getPrice());
  }

	public static void TB09 () {
		//     Product u = new Product(299,"Ziploc Bags");
		// System.out.println("u: " + u.getName());
  }

	public static void TB10 () {
		// Product v = new FreeCandy(30);
		//  System.out.println("v: " + v.getCalories());     
  }

  public static void main (String [] args) {
	  System.out.println("TB01");TB01();
	  System.out.println("TB02");TB02();
	  System.out.println("TB03");TB03();
	  System.out.println("TB04");TB04();
	  System.out.println("TB05");TB05();
	  System.out.println("TB06");TB06();
	  System.out.println("TB07");TB07();
	  System.out.println("TB08");TB08();
	  System.out.println("TB09");TB09();
	  System.out.println("TB10");TB10();
  } 
} 
