import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FooTest {

    @Test
    void myFirstTest() {
        Foo f = new Foo();

        assertEquals(10, f.sum(8, 2));
    }

}