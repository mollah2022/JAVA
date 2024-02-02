class student{
  
   String name;
   String Gender;
   String Email;
   int id;
   int age;
   
   student(){
 
     System.out.println("NO Informaation\n");
     
    }
    
    student(String s1,String s2){
         name   = s1;
         Gender = s2;
     }
     
       student(String s1,String s2,String s3){
         name   = s1;
         Gender = s2;
         Email  = s3;
     }
     
        student(String s1,String s2,String s3,int a){
         name   = s1;
         Gender = s2;
         Email  = s3;
         id     = a;
     }
   
   student(String s1,String s2,String s3,int a,int b){      
        name   = s1;
        Gender = s2;
        Email  = s3;
        id     = a;
        age    = b;
   }
   
   void display_infarmation(){
    
    System.out.println("NAME : "+name);
    System.out.println("E-mail: "+Email);
    System.out.println("GENDER : "+Gender);
    System.out.println("ID : "+id);
    System.out.println("AGE : "+age);
    System.out.println("\n");
    
    }
  
}
class Teacher5{
 
 public static void main(String[] args){
   System.out.println("Information studen_0 :");
   student ob0 = new student();
   
   student ob1 = new student("SAJIB","MALE");  
   System.out.println("Information studen_1 : ");
   ob1.display_infarmation();
   
   student ob2 = new student("EMARN","MALE","emran@gmail.com");
   System.out.println("Information studen_2 : ");
   ob2.display_infarmation();
   
   student ob3 = new student("ANIM","MALE","anim@gmail.com",2125);
   System.out.println("Information studen_3 :");
   ob3.display_infarmation();
   
   student ob4 = new student("Ridwan","MALE","ridwan@gmail.com",2125,29);
   System.out.println("Information studen_3 :");
   ob4.display_infarmation();
 
 }
 
}
