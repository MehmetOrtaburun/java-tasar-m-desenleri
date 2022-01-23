package adaptorMetod;

public class CodeXAdaptor implements Crypt{

    // CodeX in kullanabilmek için bir bağlantı gerekli bu yüzden CodeX den composite oluşur.

    private CodeX codeX;
    public  CodeXAdaptor(CodeX codeX){
        this.codeX=codeX;
    }


    @Override
    public void encrypt(String text) {
        codeX.textToCode(text);
    }

    @Override
    public void decrypt(String text) {
        codeX.codeToText(text);

    }
}
