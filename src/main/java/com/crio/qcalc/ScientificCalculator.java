package com.crio.qcalc;
import java.lang.Math;
public class ScientificCalculator extends StandardCalculator{
    public void add(double a, double b) {
        this.result = a + b;

        if (this.result > Integer.MAX_VALUE)
            throw new ArithmeticException();
    
    }

    @Override
    public void add(int a, int b) {

        this.add((double)a, (double)b);

    }

	public void subtract(double a, double b)
	{
        this.result =  a - b;
    
        if (this.result < Integer.MIN_VALUE)
        throw new ArithmeticException();

    }
    @Override
    public void subtract(int a, int b) {

        this.subtract((double)a, (double)b);

    }
	public void multiply(double a, double b)
	{
		this.result= a*b;
    }
    @Override
    public void multiply(int a, int b) {

        this.multiply((double)a, (double)b);

    }
	public void divide(double a, double b)
	{
		this.result= a/b;
    }
    @Override
    public void divide(int a, int b) {

        this.divide((double)a, (double)b);

    }
    void pow(double a, double b){
        this.result=Math.pow(a,b);
    }
}