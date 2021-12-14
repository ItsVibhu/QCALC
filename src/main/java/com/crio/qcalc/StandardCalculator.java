package com.crio.qcalc;
class StandardCalculator{
    protected double result;
    public void add(int a, int b) {
        this.result =(long)a + b;

        if (this.result > Integer.MAX_VALUE)
            throw new ArithmeticException();
    
    }
	public void subtract(int a, int b)
	{
        this.result =(long) a - b;
    
        if (this.result < Integer.MIN_VALUE)
        throw new ArithmeticException();

	}
	public void multiply(int a, int b)
	{
		this.result= a*b;
	}
	public void divide(int a, int b)
	{
		this.result= (double)a/b;
    }
public double getResult(){
return this.result;
}

}