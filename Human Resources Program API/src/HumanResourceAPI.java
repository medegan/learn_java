public class HumanResourceAPI {
    public static void main(String[] args) {
        System.out.println("Human Resource Application is Starting");
        System.out.println();

        //create new department
        Department d1 = new Department("Mobile");
        System.out.println(d1.toString());

       //create new Employee
        Employee employee1 = new Employee(1, "Afo", "Mobile", 625);
        Employee employee2 = new Employee(2, "Afosky", "Mobile", 625);
        Employee employee4 = new Employee(4, "Taiwo", "Mobile", 505);

        //add employee to dept
        d1.addEmployees(employee1);
        d1.addEmployees(employee2);
        d1.addEmployees(employee4);

        //locate an employee by id
        System.out.println(d1.getSpecificEmployee(2).toString());

        //Every employee in the department and print their info
        Employee[] allEmployee = d1.getAllEmployees();
        System.out.println();
        for(Employee e: allEmployee){
            System.out.println(e.toString());
        }

        //total salary of the department
        System.out.println();
        System.out.println("Department total Salary: "+d1.getTotalSalary());

        //average salary of the department
        System.out.println();
        System.out.println("Department average salary: "+d1.getAverageSalary());

    }
}