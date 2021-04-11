package com.example.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class Task2Test {

    @Test
   // @Disabled("for now")
    @DisplayName("show if correct")
    void CorrectTest() {
        //given;
        Task2 tsk = new Task2();
        //when;
        String expected = "Hi";
        String actual = tsk.solve();
        //then;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Disabled("for now")
    @DisplayName("not implemented yet")
    void NotCorrectTest() {
        //given;
        //when;
        //then;
        Assertions.fail("Not implemented");
    }

    @Test
    @DisplayName("multiple assertion")
    void MultipleCorrectTest() {
        //given;
        //when;
       // List<Integer> list = List.of(1,2,3,4);
        List<Integer> list = Arrays.asList(1,2,3,4);

        //then;
    Assertions.assertAll(   () -> Assertions.assertEquals(1, list.get(0)),
                            () ->     Assertions.assertEquals(2, list.get(1)),
                            () -> Assertions.assertEquals(3, list.get(2)),
                            () -> Assertions.assertEquals(4, list.get(3))
        );
    }

}
