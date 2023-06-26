public class quiz2 {
    public static void main(String[] args) {
        printNumber((int)3.5);
    }
    private static void printNumber(double i) {
        System.out.println(i);
        System.out.println("double");
    }
    private static void printNumber(int i) {
        System.out.println(i);
        System.out.println("int");
    }
    private static void printNumber(float i) {
        System.out.println(i);
        System.out.println("float");
    }
}
