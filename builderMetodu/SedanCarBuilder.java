package builderMetodu;

public class SedanCarBuilder implements CarBuilder{

    private final Car car=new Car("Sedan");

    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("Sedan4 kapı");

    }

    @Override
    public void buildPower() {
        car.setPower("115 beygir");

    }

    @Override
    public void buildEngine() {

        car.setEngine("1.6");

    }

    @Override
    public void buildBreaks() {
        car.setBreaks("280 mm disk fren");

    }

    @Override
    public void buildseats() {
        car.setSeats("4 koltuk");

    }

    @Override
    public void buildWindows() {
        car.setWindows("4 pencere");

    }

    @Override
    public void buildfuelType() {
        car.setFueltype("Dizel");

    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
