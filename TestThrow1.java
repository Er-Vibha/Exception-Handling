//Throwing Checked Exception
import java.io.*;
public class TestThrow1 {
    public static void method() throws FileNotFoundException{
        FileReader file=new FileReader("C:\\Users\\Thepa\\");
        BufferedReader fileinput=new BufferedReader(file);
        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        try{
            method();
        }
        catch (FileNotFoundException f){
            f.printStackTrace();
        }
        System.out.println("Rest Code");
    }
}
