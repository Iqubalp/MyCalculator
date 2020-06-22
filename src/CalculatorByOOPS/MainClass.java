package CalculatorByOOPS;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Addition
		BaseClass add= new Addition(100,10);
add.Operation();
int Add = add.getResult();
System.out.println("Addition is : " +Add);

//Substraction
BaseClass  sub= new Substraction(50,10);
sub.Operation();
int Sub= sub.getResult();
System.out.println("Substraction is : " +Sub);

//Multiplication
BaseClass  mul= new Multiplication(50,10);
mul.Operation();
int Mul= mul.getResult();
System.out.println("Multiplication is : " +Mul);

//Devision
BaseClass  dev= new Devision(50,10);
dev.Operation();
int Dev= dev.getResult();
System.out.println("Devision is : " +Dev);
	}

}
