public class main {
    public int value;
    public main() {
        value = 10;
    }
    public void displayValue() {
        System.out.println("The value is: " + value);
    }
    public static void main(String[] args) {
        main obj = new main();
        obj.displayValue();
    }
}
