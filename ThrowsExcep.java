public class ThrowsExcep {
   static void run() throws IllegalAccessException{
        throw new IllegalAccessException("demo");
    }
    //this is caller function
    public static void main(String[] args) {
        try{
            run();
        }
        catch (IllegalAccessException e){
            System.out.println("Caught in main");
        }
    }
}
