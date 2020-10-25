package ua.nure.sorokina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    @Test
    void encode() {
        assertEquals("0 00 00 000 0 0 00 0 0 00 00 0000 0 0", Encoder.encode("ba"));
    }

    @Test
    void encodeEmptyOrNull() {
        assertEquals("", Encoder.encode(""));

        assertEquals("", Encoder.encode(null));
    }
}