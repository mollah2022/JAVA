public class copyanother {
      String country;
      String name;
      int age;
      copyanother (String s1, int y){
      name = s1;
      age = y;
      }
      copyanother(copyanother another,String c){
       name =  another.name;
        age = another.age;
        country = c;
      }
      void display(){
      System.out.println("COUNTRY: "+country);
     System.out.println("NAME: "+name);
     System.out.println("AGE: "+age);
     }
    public static void main(String[] args){
      copyanother ob1 = new copyanother ("SAJIB AHME",66);
        ob1.display();
      copyanother ob2 = new copyanother (ob1,"BANGLADESH");
        ob2.display();
    }  
}
