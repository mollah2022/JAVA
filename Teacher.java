class student{
  
   String name;
   String Gender;
   int id;
   int age;
   
   void display_infarmation(){
    
    System.out.println("NAME : "+name);
    System.out.println("GENDER : "+Gender);
    System.out.println("ID : "+id);
    System.out.println("AGE : "+age);
    System.out.println("\n");
    
    }
  
}
class Teacher{
 
 public static void main(String[] args){
 
   student ob1 = new student();  
   ob1.name="SAJIB";
   ob1.Gender = "MALE";
   ob1.id = 212251;
   ob1.age = 24;
   System.out.println("Information studen_1 : \n");
   ob1.display_infarmation();
   
   student ob2 = new student();
   ob2.name="AMIR";
   ob2.Gender = "MALE";
   ob2.id = 21225107;
   ob2.age = 42;
   System.out.println("Information studen_2 : \n");
   ob2.display_infarmation();
   
   student ob3 = new student();
   ob3.name="JIHAN";
   ob3.Gender = "MALE";
   ob3.id = 212259;
   ob3.age = 21;
   System.out.println("Information studen_3 : \n");
   ob3.display_infarmation();
 
 }
 
}
