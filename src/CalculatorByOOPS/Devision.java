package CalculatorByOOPS;

//Inheriting BaseClass to local class
public class Devision extends BaseClass{
	
	//Constructor
	public Devision(int a, int b) {
		super.a=a;
		super.b=b;
	}
	
	//Using Proprties of BaseClass to local method using 'super'
	private void Dev() {
		super.result=super.a/super.b;
	}
	
	//Override
protected void Operation() {
		Dev();
	}
}
