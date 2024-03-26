class problem1{
    void Student_Info(String Name,int age){
    System.out.println("Name : " + Name);
    System.out.println("Age : " + age);
    }
    void Student_Info(String Name,int age,int Intake){
        System.out.println("Name : " + Name);
        System.out.println("Age : " + age);
        System.out.println("Intake : " + Intake);

  }
    public static void main(String[] args) {
    problem1 p1=new problem1();
    p1.Student_Info("Sajib Ahmed",32);
    p1.Student_Info("Sajib Ahmed",32,49);
    }
 }
