package templateMetod;

public abstract class ConnectionTemplate {
    /* Bir algoritmanın ana yapısını bazı adımlarını
    alt sınıflara bırakarak bir fonksiyonda tanımlar.
    * */


    public final void run(){
        setDBDriver();
        setUserLogin();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();


    }

    public abstract void setDBDriver();
    public abstract void setUserLogin();
    public abstract void setData();


    public void connect(){
        System.out.println("Veri tabanı bağlantısı kuruluyor");
    }
    public void prepareStatement(){
        System.out.println("Sorgu oluşturuluyor");
    }
    public void insert(){
        System.out.println("Veriler giriliyor.");

    }
    public void close(){
        System.out.println("Bağlantı kapatılıyor");
    }
    public void destroy(){
        System.out.println("Bağlantı nesneleri yok ediliyor. ");
    }

}
