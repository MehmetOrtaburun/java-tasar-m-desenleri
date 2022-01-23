package compositeMetod;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirector implements Employee{

    // Bu sınıf composite sınıfı

    private List<Employee> employeeList=new ArrayList<Employee>();

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }
    public void removeEmployee(Employee emp){
        employeeList.remove(emp);
    }


    @Override
    public void showEmployeeDetails() {

        for (Employee emp:employeeList){
            emp.showEmployeeDetails();
        }

    }
}
