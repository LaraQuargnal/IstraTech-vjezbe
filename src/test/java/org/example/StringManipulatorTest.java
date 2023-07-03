package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class StringManipulatorTest {

    private StringManipulator stringManipulator;

    // mock označava da nije prava instanca objekta
    @Mock
    private DelimiterProvider delimiterProvider;

    @BeforeEach
    void setUp() {
        stringManipulator = new StringManipulator( delimiterProvider);
        Mockito.when(delimiterProvider.getDelimiter()).thenReturn("_");

    }


    @Test
    void shouldConcatenateTwoStringsWithSpace()  {
        // before
        final String str1 = "Pero";
        final String str2 = "Perić";

        // when
        final String rez = stringManipulator.concatenate(str1, str2);

        // then
        Assertions.assertEquals("Pero Perić", rez);
    }

    @Test
    void shouldConcatenateTwoStringsWithSpace_2() throws IOException {
        // before
        final String str1 = "Maro";
        final String str2 = "Marić";

        // when
        final String rez = stringManipulator.concatenate(str1, str2);

        // then
        Assertions.assertEquals("Maro Marić", rez);
    }

    @Test
    void shouldThrowException() {
        // before
        final String str1 = "test";
        final String str2 = "drugi";

        // when
        final String rez;
        rez = stringManipulator.concatenate(str1, str2);

        // then
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> stringManipulator.concatenate(null, "test"));

        assertEquals("Ne smije biti null", exception.getMessage());
    }

}

