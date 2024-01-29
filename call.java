public class call {

    private String name;
    private int age;
    public call(String n, int age) {
        this.name = n;
        this.age = age;
    }
    public call(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        call example1 = new call("SAJIB AHMED", 25);
        call example2 = new call("EMARN");
        System.out.println("Example 1 - Name: " + example1.getName() + ", Age: " + example1.getAge());
        System.out.println("Example 2 - Name: " + example2.getName() + ", Age: " + example2.getAge());
    }
}
