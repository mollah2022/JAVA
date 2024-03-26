class problem2{
    void Student_Info(String Name,String Department,float Total_Marks){
    System.out.println("Name : " + Name);
    System.out.println("Department : " + Department);
    System.out.println("Total Marks : " + Total_Marks);

    }
    void Student_Info(String Name,String Department,int Total_Marks){
        System.out.println("Name : " + Name);
        System.out.println("Department : " + Department);
        System.out.println("Total Marks : " + Total_Marks);

    }
    public static void main(String[] args) {
    problem2 p2=new problem2();
    p2.Student_Info("Sajib Ahmed","CSE",780.86f);
    p2.Student_Info("Sajib Ahmed","CSE",1020);
    }
 }
