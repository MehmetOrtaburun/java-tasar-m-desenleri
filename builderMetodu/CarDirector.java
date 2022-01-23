package builderMetodu;

public class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder){
        this.builder=builder;
    }

    public void build(){
        builder.buildBodyStyle();
        builder.buildPower();
        builder.buildEngine();
        builder.buildBreaks();
        builder.buildseats();
        builder.buildWindows();
        builder.buildfuelType();
    }
}
