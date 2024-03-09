public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI*this.radius*this.radius; //or Math.PI*Math.pow(this.radius,2)
    }

    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    @Override  //ghi de
    public String toString(){
        return "Circle[radius=" + this.radius + ", color = " + this.color + "]";
    }

}
