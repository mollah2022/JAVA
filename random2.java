interface exam{
  void examSpring();
  void examSummer();
  void examFall();
}
abstract class Spring implements exam{
   public void examSpring(){
         System.out.println("Hello EXAM");
       }
}
 class  Summer extends Spring{
    public  void examSummer(){
         System.out.println("Hello HOT");
      }
     public    void examFall(){
         System.out.println("Hello COLD");
      }
 }
 class random2{
    public static void main(String[] args){
       Summer ob1 = new Summer();
       ob1.examSpring();
       ob1.examSummer();
       ob1.examFall();
     }
}
