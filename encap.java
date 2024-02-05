class student{

    private String name;
    private String gender;
    private int age;
    
    void set_value(String name,String gender,int age){
    
           this.name   = name;
           this.gender = gender;
           this.age    = age;
    
    }
    String get_value(){
       
       return "NAME : "+name+"GENDER : "+gender+"AGE :"+age;
       
    }

}

class encap{

  public static void main(String[] args){
  
        student persion1 = new student();
        persion1.set_value("SAJIB","MALE",32);
        System.out.println(persion1.get_value());
    
  }

}
