public class TestCircle {
    public static void main(String[] args){
        System.out.println("The Circle Class:");
        Circle circle = new Circle();  //ham dung khong doi so
        System.out.println(circle.toString());
        System.out.println("area is:" + circle.getArea());
        System.out.println("circumference is: " + circle.getCircumference());

        Circle circle1 = new Circle(2.0);
        System.out.println(circle1.toString());
        System.out.println("area is:" + circle1.getArea());
        System.out.println("circumference is: " + circle1.getCircumference());

        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("radius is: " + circle4.getRadius());
        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor());


        Circle circle5 = new Circle(5.5);
        System.out.println(circle5.toString());

        Circle circle6 = new Circle(6.6);
        System.out.println(circle6.toString());
        System.out.println(circle6);
        System.out.println("Operator " + "invokes toString() too: " +  circle6);


        System.out.println("1.2 Another Circle Class:");
        Circle circle7 = new Circle(1.1);
        System.out.println(circle7);
        System.out.println("radius is: " + circle7.getRadius());
        System.out.printf("area is: %.2f%n", circle7.getArea());
        System.out.printf("circumference is: %.2f%n", circle7.getCircumference());

    }
}
