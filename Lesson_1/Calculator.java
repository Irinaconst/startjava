public class Calculator {
	
	public static void main(String[] args) {
		double a = 3;
		double b = 2;
		double rezult;
		double sign = '^';

    	if (sign == '+') {
    		rezult = a + b; 
    		System.out.println(a + "+" + b + "=" + rezult);
    	} else if (sign == '-') {
    		rezult = a - b;
    		System.out.println(a + "-" + b + "=" + rezult);
    	} else if (sign == '*') {
    		rezult = a * b;
    		System.out.println(a + "*" + b + "=" + rezult);
    	} else if (sign == '/') {
    		rezult = a / b;
    		System.out.println(a + "/" + b + "=" + rezult);
    	} else if (sign == '%') {
    		rezult = a % b;
    		System.out.println(a + "%" + b + "=" + rezult);
    	}else if (sign == '^') {
    		rezult = 1;
    		for (int i = 0; i < b; i++) {
    		rezult *= a;
    	}
    		System.out.println(a + "^" + b + "=" + rezult);
    	}
	}
}