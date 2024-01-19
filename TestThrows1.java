//With Exception
import java.io.*;
 class TestMe{
    void method() throws IOException {
        throw new IOException("Device Error");
    }
}
class TestThrows1 {
    public static void main(String[] args) throws IOException {
    TestMe t=new TestMe();
    t.method();
    System.out.println("Flow complete with error");
    }
}
