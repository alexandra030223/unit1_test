package L6_Access_Modifiers;

public class FailSoftArray {
    private int[] a;
    private int errval;
    public int length;

    public FailSoftArray(int size, int errV){
        a = new int[size];
        errval = errV;
        length = size;

    }
    public int get(int index){
        if (indexOk(index)){
            return a[index];
        }
        return errval;
    }

    public boolean put(int index, int val){
        if (indexOk(index)){
            a[index] = val;
            return true;
        }
        return false;
    }
        public boolean indexOk(int index){
        if(index>=0 & index< length) return true;
        return false;
        }
    }

