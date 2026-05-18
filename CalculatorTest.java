public class CalculatorTest {
    public static void main(String[] args) {
        Calculator Cal = new Calculator();
        
        if (Cal.add(2, 3) == 5) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}