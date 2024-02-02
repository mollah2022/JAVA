class student{

  String name;
  String gender;
  int id;
  
  student(String name,String gender,int id){
  
    this.name   = name;
    this.gender = gender;
    this.id     = id;
     
    }
    
   void display_information(){
    
       System.out.println("NAME = "+name);
       System.out.println("GENDER = "+gender);
       System.out.println("ID = "+id);
  
   }
}
 
 class copy2{
       
       public static void main(String[] args){
       
         student ob2 = new student("SAJIB","MALE",32);
         ob2.display_information();

    }
 
}
