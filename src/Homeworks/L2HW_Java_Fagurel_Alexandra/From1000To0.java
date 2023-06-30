package Homeworks.L2;
public class From1000To0 {
    public static void main(String [] args){
        int i;
        for(i = 1000; ; i = i-2){
            if(i==0) break;
            System.out.println(i);
        }
    }
}
