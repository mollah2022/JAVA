class returnvalue{
    int value;
    
    int square(int a){
      
      value = a;
      return value*value;
      }
    
 }
 
 class Teacher6{
 
    public  static void main(String[] args){
        
        returnvalue ob1 = new returnvalue();
        System.out.println("RESULT = "+ob1.square(4));
        
        returnvalue ob2 = new returnvalue();
        System.out.println("RESULT = "+ob2.square(5));
        
        returnvalue ob3 = new returnvalue();
        System.out.println("RESULT = "+ob3.square(6));
        
        returnvalue ob4 = new returnvalue();
        System.out.println("RESULT = "+ob4.square(7));
        
        returnvalue ob5 = new returnvalue();
        System.out.println("RESULT = "+ob5.square(8));
        
    }
 
 }
