/*When no exception occurs*/
//public class FinallyExAllCase {
//    public static void main(String[] args) {
//        try{
//            int a=25/5;
//            System.out.println();
//        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("Finally will Print");
//        }
//            System.out.println("This is it");
//    }
//}

/*When Exception occur and not handled*/
//public class FinallyExAllCase{
//    public static void main(String[] args) {
//        try {
//            int a=23/0;
//            System.out.println(a);
//        }
//        catch (NullPointerException e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("I am finally");
//        }
//        System.out.println("This is it");
//    }
//}

/*When Exception occur and handled*/

public class FinallyExAllCase{
    public static void main(String[] args) {
        try {
            int a=23/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("I am finally");
        }
        System.out.println("This is it");
    }
}



