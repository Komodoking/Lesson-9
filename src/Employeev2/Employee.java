package Employeev2;


abstract public class Employee {
	protected String name;
	protected int type;
	  protected double rate;
	protected int hours;
     public   static double totalpay;
	 public   static double lowrate=6.75;
          public   static double highrate=30.50;
           public   static int LowHours=1;
            public   static int HighHours=60;
         
	public Employee() {
	 name = "";
	 type = 0;
	 rate = 0;
	 hours = 0;	
	}

	
	public static String getNameRules() {
	 	return "nonblank";
	}



	public static String getRateRules() {
		return "between "+lowrate+" and "+highrate+", inclucsive";
	}

	
	public static String getHoursRules() {
		return "between "+LowHours+" and "+HighHours+" inclusive";
	}

	public final boolean setName(String nm) {
		if (nm.equals(""))
			return false;
		else{
			name=nm;
			return true;
		}
	}

	
	
	public final boolean setRate(double rt) {
		if (rt < 6.75 || rt > 30.50)
			return false;
		else{
			rate=rt;
			return true;
		}
	}

	public final boolean setHours(int hrs) {
		if (hrs < 1 || hrs > 60)
			return false;
		else{
			hours=hrs;
			return true;
		}
	}

	public final String getName() {
		return name;
	}


}
