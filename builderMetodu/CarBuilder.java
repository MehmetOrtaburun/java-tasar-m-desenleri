package builderMetodu;

public interface CarBuilder {

    public void buildBodyStyle();
    public void buildPower();
    public void buildEngine();
    public void buildBreaks();
    public void buildseats();
    public void buildWindows();
    public void buildfuelType();

    // arabayı geri döndürecek olan getCar metodu ekleyelim
    public Car getCar();

}
