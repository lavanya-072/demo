public class Employee {
       // Instance variables
        private int id;
        private String firstname;
        private String lastname;
        private String address;
    
        // Default constructor
        public Employee() {
            this.id = 0;
            this.firstname = null;
            this.lastname = null;
            this.address = null;
        }
    
        // Parameterized constructor
        public Employee(int id, String firstname, String lastname, String address) {
            this.id = id;
            this.firstname = firstname;
            this.lastname = lastname;
            this.address = address;
        }
    
        // Getter for firstname and lastname concatenation
        public String getDetails() {
            return firstname + " " + lastname;
        }
    
        // Getters and Setters (Optional, if you want to access or modify the fields)
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getFirstname() {
            return firstname;
        }
    
        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }
    
        public String getLastname() {
            return lastname;
        }
    
        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        // Main method to test the Employee class
        public static void main(String[] args) {
            // Using the default constructor
            Employee employee1 = new Employee();
            System.out.println("Employee 1 Details: " + employee1.getDetails());  // Will print "null null"
    
            // Using the parameterized constructor
            Employee employee2 = new Employee(29, "Lavanya", "Reddy", "Kalluru");
            System.out.println("Employee 2 Details: " + employee2.getDetails());  // Will print "John Doe"
        }
    }
    

