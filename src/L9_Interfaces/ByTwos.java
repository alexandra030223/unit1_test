package L9;
public class ByTwos implements Series {

int start, val;
    @Override
    public int getNext() {
        val=+2;
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
