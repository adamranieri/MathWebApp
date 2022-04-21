package dev.ranieri.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Example {

    @Test
    void should_pass(){
        Assertions.assertEquals(1,1);
    }

    @Test
    void show_environment(){
        System.out.println(System.getenv("something"));
    }
}
