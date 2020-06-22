package CalculatorByOOPS;

//Inheriting BaseClass to local class
public class Multiplication extends BaseClass{
	
	//Constructor
	public Multiplication(int a, int b) {
		super.a=a;
		super.b=b;
	}
	
	//Using Proprties of BaseClass to local method using 'super'
	private void Mul() {
		super.result=super.a*super.b;
	}
	//Override
protected void Operation() {
		Mul();
	}
}
