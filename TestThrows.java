//Without Exception
import java.io.*;
public class TestThrows {
    void input(int a) throws IOException
    {
        System.out.println(a);
    }
    public static void main(String[] args) throws IOException {
       TestThrows a=new TestThrows();
        a.input(10);
    }
}
