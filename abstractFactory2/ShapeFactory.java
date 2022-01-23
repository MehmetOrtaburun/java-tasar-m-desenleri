package abstractFactory2;

public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if ("rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();

        }
        else if ("square".equalsIgnoreCase(shapeType)){
            return new Square();

        }
        else
            return null;
    }
}
