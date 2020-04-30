public class Calculator {
	
	public static void main(String[] args) {
		double a = 3;
		double b = 2;
		double c;
		double addition = '+';
    	double subtraction = '-';
    	double multiplication = '*';
    	double division = '/';
    	double modulus = '%';
    	double exponentiation = '^';
    	double operation = division;
    	if (operation == addition) {
    		c = a + b; 
    		System.out.println(a + "+" + b + "=" + c);
    	}
    	else if (operation == subtraction) {
    		c = a - b;
    		System.out.println(a + "-" + b + "=" + c);
    	}
    	else if (operation == multiplication) {
    		c = a * b;
    		System.out.println(a + "*" + b + "=" + c);
    	}
    	else if (operation == division) {
    		c = a / b;
    		System.out.println(a + "/" + b + "=" + c);
    	}
    	else if (operation == modulus) {
    		c = a % b;
    		System.out.println(a + "%" + b + "=" + c);
    	}
    	else if (operation == exponentiation) {
    		 c = 1;
    		for (int i = 0; i < b; i++) {
    			c *= a;
    		}
    		System.out.println(a + "^" + b + "=" + c);
    	}
	}
}