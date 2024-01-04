// occur and handled in catch
public class ExampleTryCatch1 {
    public static void main(String[] args) {
        try{
            System.out.println("This is try block");
        }
        catch(ArithmeticException e){
            int i=1;
            int a=i/0;
            System.out.println(a);
        }
        System.out.println("Rest code");
    }
}
