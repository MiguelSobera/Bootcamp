package com.bootcamp.solid;

public class Multiplication implements ICalculator{
    public double a;
    public double b;
    public double result = 0.0;

 
    public String operador = "*";

	@Override
	public Double HacerOperacion(int a, int b) {
		// TODO Auto-generated method stub
		return (double) (a * b);
	}
}