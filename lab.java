class people{
   String name;
   int id;
    
    people(){
     this("SAJIB AHMED",32);
    }
    
    people(String name,int id){
    
       this.name = name;
       this.id   = id;
    }
    
    String hello(String s1){
    
       return s1;
    
    }
      
}

class lab{

public static void main(String[] args){

      people ob1 = new people();
      System.out.println(ob1.hello("SAJIB"));
      
   }

}
