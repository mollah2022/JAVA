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
              System.out.println("single_inheritance");
      }
}
class student2 extends student1{
       String phone;
       int salary;
       void print(){
           display();
           System.out.println("PHONE : "+phone);
           System.out.println("SALARY : "+salary);
           System.out.println("multilevel");
   }
 }
class student3 extends student{
           double cgpa;
           void display1(){
                 display();
                 System.out.println("CGPA : "+cgpa);
                 System.out.println("hierarchical1");
      }
}
class student4 extends student{
           int id;
           void display2(){
                 display();
                 System.out.println("ID : "+id);
                 System.out.println("hierarchical2");
      }
}
class combining{
    public static void main(String[] args){
    
        student1 ob0 = new student1();
                 ob0.name   = "SAJIB";
                 ob0.gender = "MALE";
                 ob0.age    = 44;
                 ob0.show();
        student2 ob1 = new student2();
                ob1.name   = "SAJIB";
                ob1.gender = "MALE";
                ob1.age    = 35;
                ob1.phone  = "01572467896";
                ob1.salary = 25600;
                ob1.print();
       student3 ob2 = new student3();
                ob2.name   = "SAJIB";
                ob2.gender = "MALE";
                ob2.cgpa   = 3.85;
                ob2.display1();
       student4 ob4 = new student4();
                ob4.name   = "SAJIB";
                ob4.gender = "MALE";
                ob4.id   = 21225153;
                ob4.display2();
   }
}
