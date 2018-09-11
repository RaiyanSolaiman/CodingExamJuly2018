package design;
import java.io.Serializable;
public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	public int employeeId();



	public class Employee implements Serializable{
		public String empName;
		public String empAddress;
		public transient String empDOB;
		public int empID;

		public Employee(){}
		public Employee(String empName, String empAddress, String empDOB, int empID) {
			this.empName = empName;
			this.empAddress = empAddress;
			this.empDOB = empDOB;
			this.empID = empID;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getEmpAddress() {
			return empAddress;
		}

		public void setEmpAddress(String empAddress) {
			this.empAddress = empAddress;
		}

		public String getEmpDOB() {
			return empDOB;
		}

		public void setEmpDOB(String empDOB) {
			this.empDOB = empDOB;
		}

		public int getEmpID() {
			return empID;
		}

		public void setEmpID(int empID) {
			this.empID = empID;
		}





	}
	
	//employeeName() will return employee name
	public String employeeName();
	
	//assignDepartment() will assign employee to departments
    public void assignDepartment();
	
	//calculate employee salary
	public int calculateSalary();
	
	//employee benefit
	public void benefitLayout();

}
