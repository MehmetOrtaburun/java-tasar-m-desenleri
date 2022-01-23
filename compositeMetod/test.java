package compositeMetod;

public class test {
    public static void main(String[] args) {
        Developer dev1=new Developer("mehmet ",1," junior");
        Developer dev2=new Developer("ahmet ",2," senior");

        CompanyDirector engDirectory=new CompanyDirector();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
        engDirectory.showEmployeeDetails();
        System.out.println("***************************");

        Manager m1=new Manager("kemal ",1," ık");
        Manager m2=new Manager("mustafa ",2," uretim");

        CompanyDirector mngDirectory=new CompanyDirector();
        mngDirectory.addEmployee(m1);
        mngDirectory.addEmployee(m2);
        mngDirectory.showEmployeeDetails();
        System.out.println("****************************");

        CompanyDirector director=new CompanyDirector();

        director.addEmployee(engDirectory);
        director.addEmployee(mngDirectory);
        director.showEmployeeDetails();

    }
}
