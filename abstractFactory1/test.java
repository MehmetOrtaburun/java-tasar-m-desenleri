package abstractFactory1;

public class test {
    public static void main(String[] args) {
        GUIFactory gf;
        Button btn;
        CheckBox chcbx;

        gf=new WinFactory();
        btn=gf.createButton();
        chcbx=gf.createCheckBox();

        btn.paint();
        chcbx.paint();
        System.out.println("==============================================");

        gf=new MacFactory();
        btn=gf.createButton();
        chcbx=gf.createCheckBox();

        btn.paint();
        chcbx.paint();

    }
}
