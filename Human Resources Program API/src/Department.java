import java.util.SplittableRandom;

public class Department {
    private Employee[] employees = new Employee[10];
    private String departmentName;

    public Department(String name){
        this.departmentName = name;
    }
    public String addEmployees(Employee emp){
        int maxNumEmployees = this.employees.length;
        String response;
        int count = countCurrentEmployees();
        if(count < maxNumEmployees ){
            this.employees[count] = emp;
            response = "Employee added to department successfully";
        }
        else{
            response = "Department already has max number of employee";
        }
        return response;
    }

    @Override
    public String toString(){
        String statement;

        statement = "Department "+departmentName+" has "+countCurrentEmployees()+" employees";

        return statement;
    }
    public int getNumberOfEmployees(){
        return countCurrentEmployees();
    }

    public Employee[] getAllEmployees() {
        int countNonNull = 0;
        for (Employee e : employees) {
            if (e == null) {
                break;
            }
            countNonNull++;
        }

        Employee[] currentEmp = new Employee[countNonNull];
        int count = 0;
        for (Employee emp : employees) {
            if (emp == null) {
                break;
            }
            currentEmp[count] = emp;
            count++;
        }
        return currentEmp;
    }

    public Employee getSpecificEmployee(int id){
        Employee employeeDetails = new Employee(0, null, null, 0);
        for(Employee emp: employees){
            if(emp != null) {
                if (emp.getID() == id) {
                    employeeDetails = emp;
                    break;
                }
            }
        }
            return employeeDetails;
    }

    public double getTotalSalary(){
        double salary = 0;
        for(Employee emp : employees){
            if(emp != null) {
                salary += emp.getSalary();
            }
        }
        return salary;
    }

    public double getAverageSalary(){
        double avgSalary;
        try{
            avgSalary = getTotalSalary() / countCurrentEmployees();

        }catch (ArithmeticException e){
            avgSalary = 0;
        }
        return avgSalary;
    }
    private int countCurrentEmployees(){
        int countNonNull = 0;
        for(Employee e: employees){
            if(e == null){
                break;
            }
            countNonNull ++;
        }
        return countNonNull;
    }
}
