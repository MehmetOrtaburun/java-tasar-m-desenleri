package abstractFactory3_telefon_kodlaması;

public interface TelefonFabrikası {
    public Telefon createTelefon(String model,String batarya,int en,int boy);
}
