package templateMetod;

public class MySQLCssvCon extends ConnectionTemplate{
    @Override
    public void setDBDriver() {
        System.out.println("MySql driver kuruldu");
    }

    @Override
    public void setUserLogin() {
        System.out.println("MySql user bilgiler girild");

    }

    @Override
    public void setData() {
        System.out.println("Csv den veri okundu");

    }
}
