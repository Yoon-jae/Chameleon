package main.chameleon;

import org.junit.Test;

import static org.junit.Assert.*;

public class InfoTest {

    @Test
    public void testInfo() {
        assertEquals(4, 2 + 2);
        assertThat(100, is(info.testInt()));
    }
}