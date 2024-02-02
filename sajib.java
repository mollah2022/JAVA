class sajib{
  
  static String name="SAJIB";
  static int age=32;
  
  sajib(String s1,int a){
    name = s1;
    age  = a; 
 } 
  static String message(){   
     return "NAME = "+name+" AGE = "+age;
  }
  
   public static void main(String[] args){
   
     System.out.println(message());
   
   }

}
