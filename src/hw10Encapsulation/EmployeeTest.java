package hw10Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("Ummey");
		emp.setAge(20);
		emp.setSex('F');
		emp.setUsCitizen(false);

		System.out.println("The Employee Name is: " + emp.getName() + "\nEmployee Age: " + emp.getAge()
				+ "\nEmployee Sex: " + emp.getSex() + "\nand Is US Citizen? Ans: " + emp.isUsCitizen());

	}

}
