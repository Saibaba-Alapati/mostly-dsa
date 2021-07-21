//Abstract class is a class that is declared with abtract keyword
//An Abstract method is a method that is declared with out implementation
//An abstract class may or may not  have all abstract methods. Some of them may be concrete methods
//An method defined abstract must always be redefined in subclass, thus making Overrriding compulsary OR either making subclass itself abstract
//Any class contaning one or more subclass must also be declared with abstract keyword
//There can be no object of an abstract class.That is an abstract class cant not directly instatiated with the new operator.
//An abstract class can have parameterrized constructors and default contructor is always present in an abstract class.
abstract class Shape {
    String color;
    abstract double area();
    public abstract String toString();
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;
    public Circle(String color, double radius) {
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is : " + area();
    }
}

public class AbstractImplementation {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red",2.2);
        System.out.println(s1.toString());
    }
}

//reduces complexity of veiwing things
//Avoids code duplicationa d increases code reusability
//Helps to increase security of an application or program as only important details are provided to user