package com.visionit.calculator;

public class Mycalculator {
static int a;
static int b;
static int result;

public static void add() {
	result=a+b;
}

public static void sub() {
	result=a-b;
}

public static void mul() {
	result=a*b;
}

public static void div() {
	result=a/b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a=100;
		b=10;
add();
System.out.println("Addition is : "+result);

sub();
System.out.println("Substraction is :"+result);

mul();
System.out.println("Multiplication is :"+result);

div();
System.out.println("Devision is : "+result);

	}

}
