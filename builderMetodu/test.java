package builderMetodu;

public class test {
    public static void main(String[] args) {
        CarBuilder carBuilder=new SedanCarBuilder();
        CarDirector director=new CarDirector(carBuilder);
        Car car=carBuilder.getCar();
        director.build();
        System.out.println(car);

    }
}
