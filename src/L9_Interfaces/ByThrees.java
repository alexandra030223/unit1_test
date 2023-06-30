package L9;

public class ByThrees implements Series{
    int start, val;
    ByThrees(){
        start = val = 0;
    }
    @Override
    public int getNext() {
        val=+3;
        return 0;
    }

    @Override
    public void reset() {
        start = val = 0;

    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;

    }
}
