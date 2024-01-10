//Throwing User Defined Exception
class UserDefinedException extends Exception{
    public UserDefinedException(String s){
        super(s);
    }
}
public class TestThrow2 {
    public static void main(String[] args) {
        try {
        throw new UserDefinedException("This is User Defined Exception");
        }
        catch (UserDefinedException u)
        {
            System.out.println("Caught the Exception");
            System.out.println(u.getMessage());
        }
        }
    }

