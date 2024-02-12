public class finallyEx {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=4;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error Catched");
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally block ");//Finally block will execute
        }
    }
}
