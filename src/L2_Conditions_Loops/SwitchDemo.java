package L2_Conditions_Loops;
public class SwitchDemo {
    public static void main(String[] args){
////        switch (expression){
////            case constant1:
////                sequence of operators
////                break;
////            case constant2:
////                sequence of operators
////                break;
////            default:
////                sequence of operators
//        }
    int i;
    for (i=0; i<10; i++)
//        switch (i) {
//            case 0:
//                System.out.println("i is equal to 0");
//                break;
//            case 1:
//                System.out.println("i is equal to 1");
//                break;
//            default:
//                System.out.println("i is equal or greater than 2");
//        }

            switch (i) {
            case 0 -> System.out.println("i is equal to 0");
            case 1 -> System.out.println("i is equal to 1");
            case 2 -> System.out.println("i is equal to 2");
            case 3 -> System.out.println("i is equal to 3");
            default -> System.out.println("i is equal or greater than 4");
        }
    }
}
