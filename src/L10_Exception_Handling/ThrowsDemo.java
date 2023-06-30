package L10_Exception_Handling;
import java.io.IOException;
public class ThrowsDemo {
    public static char prompt(String str) throws IOException{
        System.out.println(str + ": ");
        return (char) System.in.read();
    }
    public static void main(String [] args){
        char ch;
        try{
            ch = prompt("Enter a letter");
        }catch (IOException e){
            System.out.println("Inout Output Exception has occured");
            ch = 'X';
        }
        System.out.println("You have entered " + ch);
    }
}
