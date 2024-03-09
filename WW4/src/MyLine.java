
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin.setXY(x1, y1);
        this.end.setXY(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return this.begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return this.end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndX() {
        return this.end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public int[] getBeginXY() {
        int[] result = this.begin.getXY();
        return result;
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public int[] getEndXY() {
        int[] result = this.end.getXY();
        return result;
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public double getLength() {
        return this.begin.distance(end);
    }

    public double getGrandient() {
        int xDiff = this.begin.getX() - this.end.getX();
        int yDiff = this.begin.getY() - this.end.getY();
        return Math.atan2(yDiff, xDiff);
    }

    public String toString() {
        return "MyLine[begin=" + this.begin.toString()
                + ", end=" + this.end.toString() + "]";
    }
}