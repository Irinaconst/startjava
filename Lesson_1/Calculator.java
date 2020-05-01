public class Calculator {
	
	public static void main(String[] args) {
		double a = 3;
		double b = 2;
		double c;
		double sign = '^';
    		if (sign == '+') {
    			c = a + b; 
    			System.out.println(a + "+" + b + "=" + c);
    		}
    		else if (sign == '-') {
    			c = a - b;
    			System.out.println(a + "-" + b + "=" + c);
    		}
    		else if (sign == '*') {
    			c = a * b;
    			System.out.println(a + "*" + b + "=" + c);
    		}
    		else if (sign == '/') {
    			c = a / b;
    			System.out.println(a + "/" + b + "=" + c);
    		}
    		else if (sign == '%') {
    			c = a % b;
    			System.out.println(a + "%" + b + "=" + c);
    		}
    		else if (sign == '^') {
    			 c = 1;
    			for (int i = 0; i < b; i++) {
    			c *= a;
    		}
    			System.out.println(a + "^" + b + "=" + c);
    	}
	}
}