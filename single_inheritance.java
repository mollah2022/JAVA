class student{
   String name;
   String gender;
   void display(){
      System.out.println("NAME : "+name);
      System.out.println("GENDER : "+gender);
    }
}
class Teacher extends student{
          int age;
          void show(){
              display();
              System.out.println("AGE : "+age);
      }
}
class single_inheritance{
    public static void main(String[] args){
        Teacher ob1 = new Teacher();
                ob1.name   = "SAJIB";
                ob1.gender = "MALE";
                ob1.age    = 35;
                ob1.show();
   }
}
