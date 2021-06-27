
package Test;


public class Calculator {

public Calculator() {
}

//Sum method.

public int add(int a, int b) {
return a + b;
}

//Subtract method.

public int subtract(int a, int b) {
return a - b;
}


//Multiply method.

public long multiply(int a, int b) {
return a * b;
}


//Divide method.
//b sıfırdır.

public double divide(int a, int b) {
double result;
if (b == 0) {
throw new IllegalArgumentException("Bölen sıfıra bölünemez");

} else 
{
result = Double.valueOf(a)/Double.valueOf(b);
}
return result;
}
}