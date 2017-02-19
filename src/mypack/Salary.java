package mypack;

public class Salary extends Employee {
	   private double salary; // Annual salary
	   
	   //Phương thức khởi tạo
	   public Salary(String name, String address, int number, double salary) {
	      super(name, address, number);
	      setSalary(salary);
	   }
	   
	   //In ra tên và lương hàng năm
	   public void mailCheck() {
	      System.out.println("Within mailCheck of Salary class ");
	      System.out.println("Mailing check to " + getName()
	      + " with salary " + salary + "$");
	   }
	   
	   public double getSalary() {
	      return salary;
	   }
	   
	   //Nếu lương nhân viên >= 0 thì in ra lương
	   //Nếu nhỏ hơn 0 thì in ra lương = 1.0$
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	      else 
	    	  salary=1.0;
	   }
	}