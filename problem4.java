public class problem4{
    public static void main(String[] args) {
    System.out.println("String[] args");
    main("");
    main(2,3);
    main();
    }
    public static void main(String args ){
    System.out.println("String args");
    }
    public static void main(int a,int b){
     System.out.println("with Parameter");
    }
    public static void main(){
     System.out.println("Without Parameter");
    }
 }
