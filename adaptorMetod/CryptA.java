package adaptorMetod;

public class CryptA implements Crypt{

    @Override
    public void encrypt(String text) {
        System.out.println("A şifrelendi");
    }

    @Override
    public void decrypt(String text) {
        System.out.println("A çözüldü");

    }
}
