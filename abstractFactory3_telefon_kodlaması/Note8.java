package abstractFactory3_telefon_kodlaması;

public class Note8 implements Telefon{
    private String model;
    private String batarya;
    private int en;
    private int boy;

    public Note8(String model,String batarya,int en,int boy){
        this.model=model;
        this.batarya=batarya;
        this.en=en;
        this.boy=boy;
    }


    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getBaterya() {
        return this.batarya;
    }

    @Override
    public int getEn() {
        return this.en;
    }

    @Override
    public int getBoy() {
        return this.boy;
    }

    @Override
    public String toString() {
        return "Note8{" +
                "model='" + model + '\'' +
                ", batarya='" + batarya + '\'' +
                ", en=" + en +
                ", boy=" + boy +
                '}';
    }
}
