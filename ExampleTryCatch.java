//Nested Try
public class ExampleTryCatch {
        public static void main(String[] args) {
            try {
                try {
                    int i[] = new int[5];
                    i[6] = 10;
                    System.out.println(i);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Null Pointer");
                }
                try {
                    int a = 1 / 0;
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception ");
                }
                System.out.println("Rest code");
            }
            catch(Exception e)
            {
                System.out.println("handled the exception (outer catch)");
            }
        }
    }

