import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class RefGarbageCollectorTest {
    public static void main(String[] args) throws InterruptedException {
        Object strong = new Object();
        WeakReference<Object> weak = new WeakReference<>(new Object());
        SoftReference<Object> soft = new SoftReference<>(new Object());
        PhantomReference<Object> phantom =
                new PhantomReference<>(new Object(), new ReferenceQueue<>());

        System.out.println("Before GC: " + weak.get() + ", " + soft.get() + ", " + phantom.get());
        System.gc(); Thread.sleep(100);

        System.out.println("After GC: " + weak.get() + ", " + soft.get() + ", " + phantom.get());
    }
}
