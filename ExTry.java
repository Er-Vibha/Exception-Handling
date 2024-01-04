public class ExTry {
    public static void main(String[] args) {
        try{
            int i=10;
            int a=i/0;
            System.out.println(a);
        }
        catch (Exception e){
        System.out.println(e);
        }
        System.out.println("This part will run");
    }
}
