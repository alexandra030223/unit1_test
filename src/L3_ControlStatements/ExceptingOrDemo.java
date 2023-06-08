package L3_ControlStatements;

public class ExceptingOrDemo {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Is the product on 5% discount?");
//        boolean isDiscounted = in.nextBoolean();
//
//        System.out.println("Do you have 50% discount card?");
//        boolean hasCard = in.nextBoolean();
//
//        System.out.println("Enter product price");
//        double initialPrice = in.nextDouble();
//        double finalPrice;

        boolean one = true;
        boolean two = false;
        boolean three = false;

        if(one ^ two ^ three){
            System.out.println("returns TRUE");
//            if (isDiscounted) finalPrice = initialPrice / 2;
//            else finalPrice = initialPrice * 0.8;

//        } else {
//            if (isDiscounted){
//                System.out.println("WARNING! You cannot apply  the discount to already discounted product. You have card bit is not applied.    ");
//                initialPrice /=2;
            }else{
                System.out.println("returns FALSE");
//                finalPrice = initialPrice;
            }
        System.out.println("The discount has  ben applied. The final product will cost ");
        }
}