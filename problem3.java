class problem3{
    void Student_Info(String Department,String Name,float Total_Marks){
    System.out.println("Department : " + Department);
    System.out.println("Name : " + Name);
    System.out.println("Total Marks : " + Total_Marks);

    }
    void Student_Info(int Total_Marks,String Name,String Department){
        System.out.println("Total Marks : " + Total_Marks);
        System.out.println("Name : " + Name);
        System.out.println("Department : " + Department);

    }
    public static void main(String[] args) {
    problem3 p3=new problem3();
    p3.Student_Info("EEE","Sajib Ahmed",730.86f);
    p3.Student_Info(998,"Sajib Ahmed","EEE");
    }
  }
