package demo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MyAppTest {

    @Test
    public void should_say_hello() {
        System.out.println("hello, world " + System.getProperty("property"));
        assertThat(new MyApp().hello("jim"), is("hello, jim"));
    }
}
