public class Employee {
    private int id;
    private String name;
    private String departmentName;
    private double salary;

    public Employee(int id, String name, String departmentName, double salary){
    this.id = id;
    this.name = name;
    this.departmentName = departmentName;
    this.salary = salary;
    }

   public void setId(int id){
        this.id = id;
   }

   public int getID(){
        return this.id;
   }

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return this.name;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String toString(){
        return "Employee "+name+" with id "+id+" is been paid "+salary + " and belongs to department "+departmentName;
    }

}
