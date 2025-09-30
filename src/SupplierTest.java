import java.util.function.Supplier;

class Test {
   public int sum(int a, int b, Supplier<Integer> c) {
       if(a != 0 && b != 0) return a + b;
       return b + c.get();
   }
}

public class SupplierTest {
    public static void main(String[] args) {
        Test test = new Test();

        int a = 10;
        int b = 2;

        System.out.println(test.sum(a, b, () -> ((a * b) - b) * a));
    }
}