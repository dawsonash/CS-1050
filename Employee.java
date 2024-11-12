

public class Employee {
    // Fields (Attributes)
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // Constructor 
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    // Default constructor
    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    // Mutator 
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Accessor 
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
//ill make a method to print employee info for us to call in main
    public void getEmployeeInfo(){
System.out.println("Name: " + name + ", ID Number: " + idNumber + ", Department: " + department + ", Position: " + position);    }
    }

