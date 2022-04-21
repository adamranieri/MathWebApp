package dev.ranieri.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void should_pass(){
        Assertions.assertEquals(1,1);
    }

    @Test
    void show_environment(){
        String variable = System.getenv("something");
        Assertions.assertNotNull(variable);
    }
}
