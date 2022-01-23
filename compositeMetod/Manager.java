package compositeMetod;

public class Manager implements Employee{

    private String name;
    private int empId;
    private String position;

    public Manager(String name,int empId,String position){
        this.name=name;
        this.empId=empId;
        this.position=position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager");
        System.out.println("Ad: "+this.name+" Id: "+this.empId+" position: "+this.position);
    }



}
