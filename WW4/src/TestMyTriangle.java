public class TestMyTriangle {
    public static void main(String[] args){
        MyTriangle myTriangle = new MyTriangle(1,3,4,5,6,7);
        System.out.println(myTriangle);

        System.out.println("Type: " + myTriangle.getType());
        System.out.println("Perimeter: "+myTriangle.getPerimeter());
    }
}
