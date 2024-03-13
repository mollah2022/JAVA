import javax.swing.JOptionPane;
class add{
public static void main(String[] args){
   
   String fristNumber = JOptionPane.showInputDialog("Enter the firstNumber");
   String secondNumber = JOptionPane.showInputDialog("Enter the second");
   
   int number1 = Integer.parseInt(fristNumber);
   int number2 = Integer.parseInt(secondNumber);
    
    int sum = number1+number2;
    JOptionPane.showMessageDialog(null,"The sum is"+sum,"sum of two entegers",JOptionPane.PLAIN_MESSAGE);

  }
}
