class student{

    void display(){
    
       System.out.println("SAJIB is Not_Static");
    
    }
    
    static void display1(){
    
       System.out.println("SAJIB is Static");
    
    }

}

class staticmethod{

   public static void main(String[] args){
      
      student ob1 = new student();
      ob1.display();
      student.display1();
   
  }

}
