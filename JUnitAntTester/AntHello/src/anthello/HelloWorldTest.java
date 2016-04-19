package anthello;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloWorldTest {
    public HelloWorldTest() {
    }

    /**
     * @see HelloWorld#sayHello()
     */
    @Test
    public void testSayHello() {
        final HelloWorld hw = new HelloWorld();
        hw.sayHello();
        
        //fail("Intentional failure");
    }
}
