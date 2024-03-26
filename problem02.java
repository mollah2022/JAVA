interface A {
    void Department_Info();
    void Intake_Info();
    void Section_Info();
}

class problem02 implements A {
    public void Department_Info() {
        System.out.println("Department : CSE");
    }

    public void Intake_Info() {
        System.out.println("Intake : 49");
    }

    public void Section_Info() {
        System.out.println("Section : 04");
    }

    public static void main(String[] args) {
        problem02 obj = new problem02();

        obj.Department_Info();
        obj.Intake_Info();
        obj.Section_Info();
    }
}
