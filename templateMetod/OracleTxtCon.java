package templateMetod;

public class OracleTxtCon extends ConnectionTemplate{
    @Override
    public void setDBDriver() {
        System.out.println("Oracle dirver kuruldu");
    }

    @Override
    public void setUserLogin() {
        System.out.println("Oracle user bilgileri girildi");

    }

    @Override
    public void setData() {
        System.out.println("Txt'den veri okundu...");

    }
}
