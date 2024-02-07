interface football{
   void neymeer();
   void ronaldo();
   void messi();
   void ramos();
 }
 abstract class barca implements football{
   public  void messi(){
           System.out.println("I am Messi");
         }
  }
  
   abstract class madrid extends barca{
   public  void neymeer(){
           System.out.println("I am Neymeer");
         }
  }
  
     abstract class mn_city extends madrid{
   public  void ronaldo(){
           System.out.println("I am Ronaldo");
         }
  }
  
class m_united extends mn_city{
  public   void ramos(){
            System.out.println("I am Ramos");
    }
}

class random1{
    public static void main(String[] agrs){
          m_united ob1 = new m_united();
          ob1.neymeer();
          ob1.messi();
          ob1.ramos();
          ob1.ronaldo();
    }
}
    
