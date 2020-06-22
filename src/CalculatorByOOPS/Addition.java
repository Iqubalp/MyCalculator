package CalculatorByOOPS;

//Inheriting BaseClass to local class
public class Addition extends BaseClass{

	//Constructor
	public Addition(int a, int b) {
		super.a=a;
		super.b=b;
	}
	
	//Using Proprties of BaseClass to local method using 'super'
private void Add() {
	super.result=super.a+super.b;
}

//Override
protected void Operation() {
	Add();
}
}
