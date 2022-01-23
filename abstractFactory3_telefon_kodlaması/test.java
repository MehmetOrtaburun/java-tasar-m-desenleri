package abstractFactory3_telefon_kodlaması;

public class test {
    public static void main(String[] args) {
        TelefonFabrikası s8=new S8_Fabrikası();
       Telefon telefon= s8.createTelefon("s8","batarya",5,3);
        Telefon telefon2=s8.createTelefon("s8plus","batarya",10,6);
        System.out.println(telefon);
        System.out.println("***********************************");
        System.out.println(telefon2);

    }
}
