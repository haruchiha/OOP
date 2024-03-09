public class TestMyLine {
    public static void main(String[] args){
        MyPoint begin = new MyPoint(1,3);
        MyPoint end = new MyPoint(4,6);
        MyLine myLine1 = new MyLine(begin, end);

        System.out.println(myLine1);
        System.out.println("MyPoint begin: " + myLine1.getBegin());
        System.out.println("MyPoint beginX: " + myLine1.getBeginX());
        System.out.println("MyPoint beginY: " + myLine1.getBeginY());
        System.out.println("MyPoint end: " + myLine1.getEnd());
        System.out.println("MyPoint endX: " + myLine1.getEndX());
        System.out.println("MyPoint endY: " + myLine1.getEndY());
        System.out.println("Leng MyLine: " + myLine1.getLength());
        System.out.println("Gradient myLine: " + myLine1.getGrandient());
    }
}

