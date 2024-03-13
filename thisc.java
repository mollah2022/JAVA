class thisc{
   String name;
   int age;
   thisc(String name,int age){
        this.name=name;
        this.age = age;
     }
    void display(){
     System.out.println("NAME "+name);
     System.out.println("AGE "+age);
   }
  public static void main(String[] agrs){
       thisc ob1 = new thisc("sajib",2122);
       ob1.display();
    }
 }
