class student{
   String name;
   String gender;
   void display(){
      System.out.println("NAME : "+name);
      System.out.println("GENDER : "+gender);
    }
}
class student1 extends student{
          int age;
          void show(){
              display();
              System.out.println("AGE : "+age);
      }
}
class student2 extends student1{
       String phone;
       int salary;
       void print(){
           show();
           System.out.println("PHONE : "+phone);
           System.out.println("SALARY : "+salary);
   }
 }
class multilevel{
    public static void main(String[] args){
        student2 ob1 = new student2();
                ob1.name   = "SAJIB";
                ob1.gender = "MALE";
                ob1.age    = 35;
                ob1.phone  = "01572467896";
                ob1.salary = 25600;
                ob1.print();
   }
}
