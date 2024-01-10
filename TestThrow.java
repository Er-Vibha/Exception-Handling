//Throwing Unchecked Exception
public class TestThrow {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible for vote");
        }
        else
            System.out.println("Eligible for vote");
    }
    public static void main(String[] args) {
        validate(15);
    }
}
