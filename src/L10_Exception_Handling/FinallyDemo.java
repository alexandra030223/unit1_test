package L10_Exception_Handling;
public class FinallyDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            UseFinally.genException(i);
        }
    }
}
