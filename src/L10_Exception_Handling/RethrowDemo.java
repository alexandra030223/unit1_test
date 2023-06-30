package L10_Exception_Handling;

public class RethrowDemo {
    public static void main(String[] args) {
        try{
            Rethrow.genException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Fatal error - app interrupted.");
            System.out.println("Standard message: ");
            System.out.println(e);
            System.out.println("Stack trace: ");
            e.printStackTrace();
        }finally {
            System.out.println("THIS WILL BE PRINTED NO MATTER WHAT");
        }
        System.out.println("AND THIS WILL BE PRINTED");
    }
}
