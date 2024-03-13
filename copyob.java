class copyob{
   String name;
   int age;
   copyob(String a,int b){
        name = a;
        age = b;
     }
     copyob(){  
      }
    void display(){
     System.out.println("NAME "+name);
     System.out.println("AGE "+age);
   }
  public static void main(String[] agrs){
       copyob ob1 = new copyob("sajib",2122);
       ob1.display();
       copyob ob2 = new copyob();
       ob2.name = ob1.name;
       ob2.age = ob1.age;
       ob2.display();
    }
 }
