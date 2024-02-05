 class student{
   String name;
   String gender;
   
    void display(){
     System.out.println("NAME : "+name);
     System.out.println("GENDER : "+gender);
   }
}

 class teacher extends student{
    String qualification;
    int id;
    
    void display1(){
         display();
       System.out.println("QUALIFICATION : "+qualification);
       System.out.println("ID : "+id);
    
    }

}
 class inheritance{

   public static void main(String[] agrs){
   
      student ob1 = new student();
        ob1.name = "SAJIB";
        ob1.gender = "MALE";
      //ob1.display();
      teacher ob2 = new teacher();
      ob2.name = "EMRAN";
      ob2.gender = "MALE";
      ob2.qualification = "B.sc in CSE";
      ob2.id = 212251;
      ob2.display1();
      
    }
 }
