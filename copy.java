class copy{
   String name;
   int age;
   copy(String a,int b){
        name = a;
        age = b;
     }
     copy(copy pagol){
         name = pagol.name;
         age = pagol.age;
      }
    void display(){
     System.out.println("NAME "+name);
     System.out.println("AGE "+age);
   }
  public static void main(String[] agrs){
       copy ob1 = new copy("sajib",2122);
       ob1.display();
       copy ob2 = new copy(ob1);
       ob2.display();
    }
 }
