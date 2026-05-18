public class CalculatorTest {
    public static void main(String[] args) {
        
        // Addition Test (Calling directly using the Class Name)
        if (Calculator.add(2, 3) == 5) {
            System.out.println("Addition Test Passed");
        } else {
            System.out.println("Addition Test Failed");
        }

        // Subtraction Test
        if (Calculator.subtract(10, 4) == 6) {
            System.out.println("Subtraction Test Passed");
        } else {
            System.out.println("Subtraction Test Failed");
        }

        // Multiplication Test
        if (Calculator.multiply(3, 4) == 12) {
            System.out.println("Multiplication Test Passed");
        } else {
            System.out.println("Multiplication Test Failed");
        }
    }
}