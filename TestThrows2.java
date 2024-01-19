//Error Handled using Try/Catch
import java.io.*;
class TestThrows2 {
    void m() throws IOException{
    throw new IOException("Error");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
           n();
        }
        catch (Exception e){
            System.out.println("Exception handled");
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
    TestThrows2 t=new TestThrows2();
    t.p();
    System.out.println("Running flow");
    }
}
