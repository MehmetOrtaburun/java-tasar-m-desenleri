package templateMetod;

public class test {
    public static void main(String[] args) {
        System.out.println("MySQL-CSV");
        ConnectionTemplate template = new MySQLCssvCon();
        template.run();
        System.out.println("");
        System.out.println("Oracle Txt");
        template = new OracleTxtCon();
        template.run();

    }
}
