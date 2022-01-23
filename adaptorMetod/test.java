package adaptorMetod;

public class test {
    public static void main(String[] args) {
        Crypt crypt=new CryptA();
        crypt.encrypt("mehmet");
        crypt.decrypt("Ahmet");

        CodeX codeX=new CodeX();
        crypt=new CodeXAdaptor(codeX);  // uyumsuz arayüz adapte olmuş olur.

    }
}
