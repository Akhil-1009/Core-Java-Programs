
class Employee{
	//instance variable
		String firstName= "Akhil";
		String lastName = " Suryawanshi";
		Double salary = 50000.00;		
	
	public static  void main(String [] args){
		Employee emp = new Employee();
		System.out.println("First Name : "+emp.firstName);
		System.out.println("Last Name : "+emp.lastName);
		System.out.println("Salary : "+emp.salary);
	}
}
