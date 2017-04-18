public class UseBMI {

	public static void main(String[] args) {
		
		
		// Create a BMI object
		BMI bmi1 = new BMI("ABC", 41 ,85, 65);
		System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

		// Create another BMI object
		BMI bmi2 = new BMI("DEF",100,70);
		System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
     
		
		}
	
}
