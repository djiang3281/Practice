public class Calculator{

    public static double add(double a, double b){
	double ans = a + b;
	return ans;
    }

    public static double subtract(double a, double b){
	double ans = a + b;
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
    
    public static void Main(String[] args){
	System.out.println();
	System.out.println();
	System.out.println();
    }
}
