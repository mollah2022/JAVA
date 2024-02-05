class animal{
   String name;
   String gender;
   
   void display(){
   
         System.out.println("NAME : "+name);
        System.out.println("GENDER : "+gender);
        
      }
 }
 
 class persion extends animal{
     String phone;
     String qualification;
     void display(){
        System.out.println("NAME : "+name);
        System.out.println("GENDER : "+gender);
        System.out.println("PHONE : "+phone);
        System.out.println("QUALIFICATION : "+qualification);
      }
     
 }
 
 class teacher extends persion{
   int age;
   int id;
     void display(){
        System.out.println("NAME : "+name);
        System.out.println("GENDER : "+gender);
        System.out.println("PHONE : "+phone);
        System.out.println("QUALIFICATION : "+qualification);
        System.out.println("AGE : "+age);
        System.out.println("ID : "+id);
     
     }
   
 }
 
 class methodoverriding{
 
   public static void main(String[] args){
        
        animal ob1  = new animal();
        ob1.name = "SAJIB";
        ob1.gender = "MALE";
        ob1.display();
        persion ob2 = new persion();
        ob2.name = "SAJIB";
        ob2.gender = "MALE";
        ob2.phone = "01572467869";
        ob2.qualification = "B.sc in CSE";
        ob2.display();
        teacher ob3 = new teacher();
        ob3.name = "SAJIB";
        ob3.gender = "MALE";
        ob3.phone = "01572467869";
        ob3.qualification = "B.sc in CSE";
        ob3.age = 32;
        ob3.id = 212251;
        ob3.display();
            
   }
 }   
