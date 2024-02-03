class student{

   String name;
   static String university = "BUBT";
   int id;
   
   student(String s1,int a){
   
        name = s1;
        id   = a;
   
   }
   
   void display_information(){
   
       System.out.println("NAME :"+name);
       System.out.println("University_Name :"+university);
       System.out.println("ID :"+id);
   
   }

}

class static1{

   public static void main(String[] args){
   
        student ob1 = new student("SAJIB",21);
        ob1.display_information();
        
        student ob2 = new student("EMRAN",21);
        ob2.display_information();
   
   }

}
