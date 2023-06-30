package L6_Access_Modifiers;
public class ArrDemo {
    public static void main(String[] args) {

        FailSoftArray fs = new FailSoftArray(5, -1);

        int x = 0;
        System.out.println("Error handling without reporting: ");

        for (int i = 0; i<(fs.length * 2); i++){
            fs.put(i, i*10);
        }
        for (int i = 0; i<(fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
        }
        System.out.println();


        System.out.println("\nError handling with reporting: ");

        for (int i = 0; i<(fs.length * 2); i++){
            if(!fs.put(i, i*10));
            System.out.print("\nIndex " + i + " out of bound attempt detected!");
        }
        System.out.println();
        for (int i = 0; i<(fs.length * 2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.print(x + " ");
            else System.out.print("\nIndex " + i + " out of bound attempt detected!");
        }
        System.out.println();
    }
}
