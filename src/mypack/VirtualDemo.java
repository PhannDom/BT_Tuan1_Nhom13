package mypack;

public class VirtualDemo {

	   public static void main(String [] args) {
	      Salary s = new Salary("PhannDom", "Thai Binh", 2, 5000);
	      Employee e = new Salary("Long", "DongNai", 1, 3500);
	      System.out.println("Call mailCheck using Salary reference --");   
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	   }
	}