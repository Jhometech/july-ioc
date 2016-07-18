package in.javahome.ioc;

public class Employee extends Person{
		private String empId;

		public void setEmpId(String empId) {
			this.empId = empId;
		}
		
		public void display(){
			System.out.println(getName());
			System.out.println(getPhone());
		}
		
		
}
