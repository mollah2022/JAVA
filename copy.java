public class copy {
      String name;
      int age;
      copy (String s1, int y){
      name = s1;
      age = y;
      }
      copy(copy another){
       name =  another.name;
        age = another.age;
      }
      void display(){
     System.out.println("NAME: "+name);
     System.out.println("AGE: "+age);
     }
    public static void main(String[] args){
      copy ob1 = new copy ("SAJIB AHME",66);
        ob1.display();
      copy ob2 = new copy (ob1);
        ob2.display();
    }  
}
