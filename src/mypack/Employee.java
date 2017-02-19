package mypack;

public class Employee { 
	   //Khai báo các biến
	   private String name;
	   private String address;
	   private int number;

	   
	   //Phương thức khởi tạo
	   public Employee(String name, String address, int number) {
	      System.out.println("Constructing an Employee");
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }

	   //In ra tên và địa chỉ
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	   }

	   public String getName() {
	      return name;
	   }
	   
	   public void setName(String newName) {
		      name = newName;
	   }

	   public String getAddress() {
	      return address;
	   }
	   
	   public void setAddress(String newAddress) {
		      address = newAddress;
	   }
	   
	   public int getNumber() {
		      return number;
	   }
	   
	   public void setNumber(int newNumber) {
		      number = newNumber;
	   }
	   
	}