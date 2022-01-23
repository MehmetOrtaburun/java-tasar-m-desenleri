package abstractFactory3_telefon_kodlaması;

public class Note8_Fabrikası implements TelefonFabrikası{
    @Override
    public Telefon createTelefon(String model, String batarya, int en, int boy) {
        if("note8".equalsIgnoreCase(model)){
            return new Note8(model,batarya,en,boy);
        }
        else if("note8plus".equalsIgnoreCase(model)){
            return new Note8Plus(model,batarya,en,boy);
        }
        else
            return null;
    }
}
