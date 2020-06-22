package CalculatorByOOPS;

//Inheriting BaseClass to local class
public class Substraction extends BaseClass{
	
	//Constructor
	public Substraction(int a, int b) {
		super.a=a;
		super.b=b;
	}
	
	//Using Proprties of BaseClass to local method using 'super'
	private void Sub() {
		super.result=super.a-super.b;
}
	//Override
protected void Operation() {
		Sub();
	}
}