package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @Test
    void testAdd() {
        Kalkulator kalkulator = new Kalkulator();
        int rezultat = kalkulator.add(2,3);
        assertEquals(5,rezultat);
        // assertTrue(kalkulator.add(2,2) == 4);
    }
}