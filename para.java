class para{
   String name;
   int age;
   para(String a,int b){
        name = a;
        age = b;
     }
    void display(){
     System.out.println("NAME "+name);
     System.out.println("AGE "+age);
   }
  public static void main(String[] agrs){
       para ob1 = new para("sajib",2122);
       ob1.display();
    }
 }
