class animal{
   String name;
   String gender;
 }
 
 class persion extends animal{
     String phone;
     String band;
     
 }
 
 class teacher extends persion{
   int age;
   int id;
   
 }
 
 class operator{
 
   public static void main(String[] args){
        
        animal ob1  = new animal();
        persion ob2 = new persion();
        teacher ob3 = new teacher();
        
        System.out.println(ob1 instanceof animal);
        System.out.println(ob2 instanceof animal);
        System.out.println(ob3 instanceof animal);
        System.out.println(ob1 instanceof persion);
        System.out.println(ob1 instanceof teacher);
        System.out.println(ob3 instanceof persion);
        
   }
 }   
