public class Circle {
    private String color;
    private double radius;
    private double area;

    public Circle(String color, double radius){
        setColor(color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius*radius*3.14;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
