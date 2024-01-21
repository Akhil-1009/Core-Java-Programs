public class ComplexNumber {
    private int real;
    private int imaginary;
    ComplexNumber(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void setReal(int r)
    {
        real=r;
    }
    public void setImaginary(int i)
    {
        imaginary=i;
    }
    public int getImaginary()
    {
        return imaginary;
    }
    public int getReal(){
        return real;
    }
    public void add(ComplexNumber c)
    {
        this.real=this.real+c.real;
        this.imaginary=this.imaginary+c.imaginary;
    }
    public static ComplexNumber add(ComplexNumber c1,ComplexNumber c2)
    {   int newreal=c1.real+c2.real;
        int newimag=c1.imaginary+c2.imaginary;
        ComplexNumber cnew=new ComplexNumber(newreal, newimag);
        return cnew;
    }
    public void print()
    {
        System.out.println(real+" i "+imaginary);
    }
}
