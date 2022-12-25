package Corejava;

public class Employee {
	 
	 

	    int id;
	
	    int salary;
	  
	    String name;
	 
	 
	 
	    // Method 1
	    public void printDetails()
	    {
	        // Print and display commands
	        System.out.println("My id is " + id);
	        System.out.println("This is my name " + name);
	    }
	 
	    // Method 2
	    public int getSalary()
	    {
	 
	        // Simply returning the salary
	        return salary;
	    }
	}
	 
	// Class 2
	// Main class
	class Custom {
	 
	    // Main driver method
	    public static void main(String[] args)
	    {
	 
	        // Display message only
	        System.out.println("This is the custom class");
	 
	        // Creating object of custom class in the main()
	        // method Instantiating a new Employee object
	        Employee harry = new Employee();
	 
	        // Again creating object of custom class and
	        // instantiating a new Employee object
	        Employee robin = new Employee();
	 
	        // Initializing values for first object created
	        // above
	        harry.id = 23;
	        harry.salary = 100000;
	        harry.name = "Ritu bhatiya";
	 
	        // Initializing values for second object created
	        // above
	        robin.id = 25;
	        robin.salary = 150000;
	        robin.name = "Amit thripathi";
	 
	        // Printing object attributes by
	        // calling the method as defined in our class
	        harry.printDetails();
	        robin.printDetails();
	 
	        // Calling the method again of our class and
	        // storing it in a variable
	        int salary = robin.getSalary();
	 
	        // Print and display the above salary
	        System.out.println("Salary of robin : " + salary
	                           + "$");
	 
	        System.out.println("ID : " + harry.id);
}
}