public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public double getPerimeter(){
        double a = this.v1.distance();
        double b = this.v2.distance();
        double c = this.v3.distance();
        return a+b+c;
    }
    public String getType() {
        if (this.v1.distance() == this.v2.distance() && this.v1.distance() == this.v3.distance())
            return "equilateral";
        else if (this.v1.distance() == this.v2.distance() || this.v1.distance() == this.v3.distance() || this.v2.distance() == this.v3.distance()) {
            return "isosceles";
        } else
            return "scalene";
    }
    @Override
    public String toString(){
        return "MyTriangle[v1 = " + this.v1
                + ", v2 = " + this.v2
                + ", v3 = " + this.v3
                + "]";
    }
}
