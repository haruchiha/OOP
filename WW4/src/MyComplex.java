public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){
        this.real = real;
        this.imag = imag;
    }
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public double getReal(){
        return this.real;
    }
    public void setReal(double real){
        this.real = real;
    }
    public double getImag(){
        return this.imag;
    }
    public void setImag(double imag){
        this.imag = imag;
    }
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public String toString(){
        return "(" + this.real + " + " + this.imag + "i)";
    }
    public boolean isReal(){
        if (this.imag == 0)
            return true;
        return false;
    }
    public boolean isImaginary(){
        if (this.real == 0)
            return true;
        return false;
    }
    public boolean equals(double real, double imag){
        if (this.real == real && this.imag == imag)
            return true;
        return false;
    }
    public boolean equals(MyComplex another){
        if (this.real == another.real && this.imag == another.imag)
            return true;
        return false;
    }
    public double magnitude(){
        return Math.sqrt(this.real*this.real + this.imag*this.imag);
    }
    public MyComplex addInto(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.real = right.real + this.real;
        newComplex.imag = right.imag + this.imag;
        return newComplex;
    }
    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex newComplex = new MyComplex();
        newComplex.real = this.real - right.real;
        newComplex.imag = this.imag - right.imag;
        return newComplex;
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        return this;
    }
    public MyComplex divide(MyComplex right) {
        this.real = (this.real * right.real + this.imag * right.imag) / (right.real * right.real + right.imag * right.imag);
        this.imag = (-this.real * right.imag + this.imag * right.real) / (right.real * right.real + right.imag * right.imag);
        return this;
    }

    public MyComplex conjugate() {
        this.imag = - this.imag;
        return this;
    }


}
