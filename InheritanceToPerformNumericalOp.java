class BaseClass {
     void print(String msg, Object res)
     { 
        System.out.println(msg + res);
    } 
}

class SumClass extends BaseClass {
    double computeSum()
    {
        double sum = 0;
        for (double i = 1; i >= 0.1; i -= 0.1) 
        sum += i;
        return sum;
    }
}

class DivisorMultipleClass extends BaseClass {
    int gcd(int a, int b) 
    { 
        return b == 0 ? a : gcd(b, a % b); 
    }
    int lcm(int a, int b) 
    { 
        return (a * b) / gcd(a, b); 
    }
}

class NumberConversionClass extends BaseClass {
    String toBinary(int num) 
    { 
        return Integer.toBinaryString(num); 
    }
    String toHex(int num)
    { 
        return Integer.toHexString(num); 
    }
    String toOct(int num) 
    { 
        return Integer.toOctalString(num); 
    }
}

class CustomPrintClass extends BaseClass 
{
    void pr(String msg) {
         System.out.println("*** " + msg + " ***"); 
        }
}

public class InheritanceToPerformNumericalOp {
    public static void main(String[] args) {
        SumClass sumObj = new SumClass();
        sumObj.print("Sum: ", sumObj.computeSum());

        DivisorMultipleClass divMulObj = new DivisorMultipleClass();
        int a = 36, b = 60;
        divMulObj.print("GCD: ", divMulObj.gcd(a, b));
        divMulObj.print("LCM: ", divMulObj.lcm(a, b));

        NumberConversionClass numConvObj = new NumberConversionClass();
        int num = 42;
        numConvObj.print("Binary: ", numConvObj.toBinary(num));
        numConvObj.print("Hex: ", numConvObj.toHex(num));
        numConvObj.print("Octal: ", numConvObj.toOct(num));

        new CustomPrintClass().pr("Execution Completed");
    }
}