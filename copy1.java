class student{

  String name;
  String gender;
  int id;
  
  student(String s1,String s2,int a){
  
    name   = s1;
    gender = s2;
    id     = a;
     
    }
    
     student(student another){
 
    }
    
    void display_information(){
    
       System.out.println("NAME = "+name);
       System.out.println("GENDER = "+gender);
       System.out.println("ID = "+id);
  
   }
}
 
 class copy1{
       
       public static void main(String[] args){
       
         student ob1 = new student("SAJIB","MALE",21225153);
         student ob2 = new student(ob1);
         ob2.name   = ob1.name;
         ob2.gender = ob1.gender;
         ob2.id     = ob1.id;
         ob2.display_information();

    }
 
}
