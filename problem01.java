interface Student_Info{
void Name();
}

interface R extends Student_Info{
void Department();
}


class problem01 implements R{
public void Name(){
System.out.println("Name : Sajib Ahmed");
}
public void Department(){
System.out.println("Department : EEE");
}
public static void main(String[] args) {
problem01 obj=new problem01();
obj.Name();
obj.Department();
}
}
