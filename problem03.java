interface B {
    default void Department() {
        System.out.println("Department Info");
    }

    static void Intake() {
        System.out.println("Intake Info");
    }

    void Section();
}

class problem03 implements B {
    public void Section() {
        System.out.println("Section Info");
    }

    public static void main(String[] args) {
        B.Intake();

        problem03 obj = new problem03();

        obj.Department();

        obj.Section();
    }
}
