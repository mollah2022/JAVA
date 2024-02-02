class student{
  
   String name;
   String Gender;
   int id;
   int age;  
}
class Teacher1{
 
 public static void main(String[] args){
 
    student ob1 = new student();  
    ob1.name="SAJIB";
    ob1.Gender = "MALE";
    ob1.id = 212251;
    ob1.age = 24;
    System.out.println("Information studen_1 : ");
    System.out.println("NAME : "+ob1.name);
    System.out.println("GENDER : "+ob1.Gender);
    System.out.println("ID : "+ob1.id);
    System.out.println("AGE : "+ob1.age);
    System.out.println("\n");
    
    student ob2 = new student();
    ob2.name="AMIR";
    ob2.Gender = "MALE";
    ob2.id = 21225107;
    ob2.age = 42;
    System.out.println("Information studen_2 : ");
    System.out.println("NAME : "+ob2.name);
    System.out.println("GENDER : "+ob2.Gender);
    System.out.println("ID : "+ob2.id);
    System.out.println("AGE : "+ob2.age);
    System.out.println("\n");
   
    student ob3 = new student();
    ob3.name="JIHAN";
    ob3.Gender = "MALE";
    ob3.id = 212259;
    ob3.age = 21;
    System.out.println("Information studen_3 : ");
    System.out.println("NAME : "+ob3.name);
    System.out.println("GENDER : "+ob3.Gender);
    System.out.println("ID : "+ob3.id);
    System.out.println("AGE : "+ob3.age);
    System.out.println("\n");
 
 }
 
}
