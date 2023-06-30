package L7_Inheritance_Intro;

public class ErrorMsg {
    final static int OUTERR = 0;
    final static int INERR = 1;
    final static int DISKERR = 2;
    final static int INDEXERR = 3;

    String [] msgs = {
            "Output error",
            "Input error",
            "No more space on the disk error",
            "Index out of bounds error"
    };
    String getErrorMsg(int i){
        if (i >= 0 & i < msgs.length)
            return msgs[i];
        else
            return "Nonexistent error code.";
    }

    public static void main(String[] args) {
        ErrorMsg myOb = new ErrorMsg();

        System.out.println(ErrorMsg.INDEXERR);

    }
}
