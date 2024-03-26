interface A1{
    void Department();
    void Intake();
    void Section();
    }
    abstract class B1 implements A1{
    public void Department(){
    System.out.println("Department_Info");
    }
    }
    class C1 extends B1{
    public void Section(){
    System.out.println("Section_Info");
    }
    public void Intake(){
    System.out.println("Intake_Info");
    }
    }
    public class problem04{
    public static void main(String[] args) {
    C1 obj=new C1();
    obj.Department();
    obj.Intake();
    obj.Section();
    }
    }
