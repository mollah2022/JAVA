class student{
  
   String name;
   String Gender;
   int id;
   int age;
   
   void set_infarmation(String s1,String s2,int a,int b){      
        name   = s1;
        Gender = s2;
        id     = a;
        age    = b;
   }
   
   void display_infarmation(){
    
    System.out.println("NAME : "+name);
    System.out.println("GENDER : "+Gender);
    System.out.println("ID : "+id);
    System.out.println("AGE : "+age);
    System.out.println("\n");
    
    }
  
}
class Teacher3{
 
 public static void main(String[] args){
 
   student ob1 = new student();  
   System.out.println("Information studen_1 : \n");
   ob1.set_infarmation("SAJIB","MALE",2122,23);
   ob1.display_infarmation();
   
   student ob2 = new student();
   System.out.println("Information studen_2 : \n");
   ob2.set_infarmation("EMRAN","MALE",2123,24);
   ob2.display_infarmation();
   
   student ob3 = new student();
   System.out.println("Information studen_3 : \n");
   ob3.set_infarmation("ANIM","MALE",2125,25);
   ob3.display_infarmation();
 
 }
 
}
