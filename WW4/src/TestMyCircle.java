public class TestMyCircle {
    public static void main(String[] args){
        MyCircle myCircle = new MyCircle(3,4, 5);

        System.out.println(myCircle);
        System.out.println("Center: ("+myCircle.getCenterX()+", " + myCircle.getCenterY());
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " +  myCircle.getArea());
        System.out.println("Circumference: " + myCircle.getCircumference());

        MyPoint center = new MyPoint(0,0);
        MyCircle circle = new MyCircle(center,3);
        System.out.println(circle);
        System.out.println("Center: (" + circle.getCenterX()+", " + circle.getCenterY());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " +  circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        double distance = myCircle.distance(circle);
        System.out.println("Distance between centers of myCircle and circle: " + distance);
    }
}
