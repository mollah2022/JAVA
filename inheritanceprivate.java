class student{
   private String name;
   private String gender;
   
   public void setname(String name){
       this.name=name;
    }
      public void setgender(String gender){
       this.gender=gender;
    }
    
      public String getname(){
         return name;
    }
      public String getgender(){
         return gender;
    }
   
  }
  class teacher extends student{
      private String qualification;
      private int age;
      
         public void setqualification(String qualification){
       this.qualification=qualification;
    }
      public void setage(int age){
       this.age=age;
    }
    
      public String getqualification(){
         return qualification;
    }
      public int getage(){
         return age;
    }
      
      void display_information(){
       System.out.println("NAME : "+getname());
       System.out.println("GENDER : "+getgender());
       System.out.println("QUALIFICATION: "+getqualification());
       System.out.println("AGE : "+getage());
   }
 }
 
 class inheritanceprivate{
 
     public static void main(String[] args){
        teacher ob1 = new teacher();
        ob1.setname("SAJIB");
        ob1.setgender("MALE");
        ob1.setqualification("B.sc in CSE");
        ob1.setage(32);
        ob1.display_information();
    }
 }
