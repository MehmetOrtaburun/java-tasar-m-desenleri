package abstractFactory3_telefon_kodlaması;

public class S8_Fabrikası implements TelefonFabrikası{
    @Override
    public Telefon createTelefon(String model, String batarya, int en, int boy) {
        if("S8".equalsIgnoreCase(model)){
            return new S8(model,batarya,en,boy);
        }
        else if ("S8Plus".equalsIgnoreCase(model)) {
            return new S8Plus(model,batarya,en,boy);

        }
        else
            return null;
    }
}
