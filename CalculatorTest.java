public class CalculatorTest {
    public static void main(String[] args) {
        Calculator Cal = new Calculator();
        
        
        if (Cal.add(2, 3) == 5) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }

        
        if (Cal.subtract(10, 4) == 6) {
            System.out.println("Subtraction Test Passed");
        } else {
            System.out.println("Subtraction Test Failed");
        }

        
        if (Cal.multiply(3, 4) == 12) {
            System.out.println("Multiplication Test Passed");
        } else {
            System.out.println("Multiplication Test Failed");
        }
    }
}