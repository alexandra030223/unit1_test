package Homeworks.L5HW_Java_Arrays_Fagurel_Alexandra;
public class Queue {
    char q[];
    int putloc, getloc;

    Queue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
