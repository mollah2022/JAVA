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
class student2 extends student{
       String phone;
       int salary;
       void print(){
           display();
           System.out.println("PHONE : "+phone);
           System.out.println("SALARY : "+salary);
   }
 }
 class student3 extends student{
           double cgpa;
           int id;
           void display1(){
                display();
                System.out.println("CGPA : "+cgpa);
                System.out.println("ID : "+id);
     }
}
class hierarchical{
    public static void main(String[] args){
        student1 ob1 = new student1();
                ob1.name   = "SAJIB";
                ob1.gender = "MALE";
                ob1.age    = 35;
                ob1.show();
        student2 ob2 = new student2();
                ob2.name   = "SAJIB";
                ob2.gender = "MALE";
                ob2.phone  = "01572467896";
                ob2.salary = 25600;
                ob2.print();
       student3 ob3 = new student3();
                ob3.name   = "SAJIB";
                ob3.gender = "MALE";
                ob3.cgpa   = 3.59;
                ob3.id     = 21225153;
                ob3.display1();
   }
}
