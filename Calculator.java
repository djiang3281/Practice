import java.util.Scanner;
public class Calculator{

    public Calculator(){
	System.out.println("Input two numbers");
    }

    public static double add(double a, double b){
	double ans = a + b;
	return ans;
    }

    public static double subtract(double a, double b){
	double ans = a - b;
	return ans;
    }

    public static double multiply(double a, double b){
	double ans = a * b;
	return ans;
    }

    public static double divide(double a, double b){
	double ans = a / b;
	return ans;
    }

    public static double powerOf(double a, double b){
	double ans = a;
	for(int i = 1; i < b; i++){
	    a = a * a;
	}
	return a;
    }
    
    public static void main(String[] args){
        Calculator Ned = new Calculator();
	Scanner sc = new Scanner(System.in);
	double num0 = sc.nextDouble();
	double num1 = sc.nextDouble();
	System.out.println("addition: " + add(num0, num1));
	System.out.println("subtraction: " + subtract(num0, num1));
	System.out.println("multiplication: " + multiply(num0, num1));
	System.out.println("division: " + divide(num0, num1));
	System.out.println("powerOf: " + powerOf(num0, num1));
    }
}
