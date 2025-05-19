/**
 * 工厂模式
 */
class ShapeFactory{
    public static Shape getShape(String str){
        if ("矩形".equals(str)){
            return new Rectangle();
        }else if ("圆形".equals(str)){
            return new Circle();
        }else {
            return null;
        }
    }
}

public interface Shape {
    void drop();
}
class Rectangle implements Shape{

    @Override
    public void drop() {
        System.out.println("矩形");
    }
}

class Circle implements Shape{
    @Override
    public void drop() {
        System.out.println("圆形");
    }
}



class demo{
    public static void main(String[] args) {
        //Shape shape = ShapeFactory.getShape("矩形");
        Shape shape = ShapeFactory.getShape("圆形");
        shape.drop();
    }
}