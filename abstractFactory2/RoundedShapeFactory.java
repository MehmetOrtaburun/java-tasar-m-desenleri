package abstractFactory2;

public class RoundedShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if("roundedRectangel".equalsIgnoreCase(shapeType)){
            return new RaundedRectangle();
        }
        else if("roundedSquare".equalsIgnoreCase(shapeType)){
            return new RaoundedSquare();
        }
        else
            return null;
    }
}
